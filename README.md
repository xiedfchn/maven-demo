# Maven Demo

## Maven create release branch
`mvn release:branch -DbranchName=release/1.0`

Creating a branch involves the following release phases:

Check that there are no uncommitted changes in the sources
Change the version in the POMs if you want to change it in the branch (you will be prompted for the versions to use)
Transform the SCM information in the POM to include the final destination of the tag
Commit the modified POMs
Tag the code in the SCM as a new branch with a version name (this will be prompted for)
Bump the version in the POMs if you want to change it to a new value y-SNAPSHOT (these values will also be prompted for)
Commit the modified POMs

## Maven perform a release
`mvn --batch-mode release:prepare release:perform -DreleaseVersion=1.6.2 -DdevelopmentVersion=1.6.3-SNAPSHOT`

`--batch-mode`, run mvn command in batch mode, to prevent the Release Plugin from prompting the user for any information\
`-DreleaseVersion=1.6.2`, set release version\
`-DDdevelopmentVersion=1.6.3-SNAPSHOT`, set new development version\


### Preparing a release goes through the following release phases:

prepare release 1.6.2
- Change the version in the POMs from x-SNAPSHOT to a new version (you will be prompted for the versions to use)
- Transform the SCM information in the POM to include the final destination of the tag
- Commit the modified POMs

prepare for next development iteration
- Tag the code in the SCM with a version name (this will be prompted for)
- Bump the version in the POMs to a new value y-SNAPSHOT (these values will also be prompted for)
- Commit the modified POMs


### Perform a Release
Performing a release runs the following release phases:

Checkout from an SCM URL with optional tag
Run the predefined Maven goals to release the project 
