# How Maven versioning works

## Maven versioning convention

Maven uses a versioning convention that consists of three parts: major version, minor version, and incremental version. The version is represented by a string in the format `<major version>.<minor version>.<incremental version>`.

The major version number is incremented when there are significant changes to the project's functionality.

The minor version number is incremented when new features are added to the project.

The incremental version number is incremented when bug fixes or other minor changes are made to the project.

For example, a version 1.2.3 means that this is the 3rd incremental version of a project that has had 2 minor version releases and 1 major version release.

Additionally, Maven also uses the term `SNAPSHOT` to represent a version of a project that is under development. A SNAPSHOT version is a version of a project that is not yet released and is intended for testing and development purposes.

A `SNAPSHOT` version can be used to represent the state of a project's code at a particular point in time. For example, if a project is in the middle of development and is being frequently updated, it can be versioned as `1.0-SNAPSHOT`. This version would indicate that the project is in version 1.0 and is in the development phase.

When a project is ready for release, the `SNAPSHOT` version should be removed from the version number and the project should be re-released with a final version number, such as 1.0.

:::note
`SNAPSHOT` versions are not recommended for use in production, and they are not guaranteed to be backward-compatible. They are intended to be used during the development process.
:::

## Contrast with semantic versioning

The Maven versioning convention and semantic versioning (SemVer) are similar in some aspects, but there are also some differences.

Both conventions consist of a version number that is composed of three parts: major version, minor version, and patch version. However, the meaning of these parts is slightly different in each convention.

In Maven, the major version number is incremented when there are significant changes to the project's functionality, the minor version number is incremented when new features are added to the project, and the incremental version number is incremented when bug fixes or other minor changes are made to the project.

On the other hand, in Semantic Versioning, the major version number is incremented when backwards-incompatible changes are made to the project, the minor version number is incremented when backwards-compatible new features are added to the project, and the patch version number is incremented when backwards-compatible bug fixes are made to the project.

Another difference is that the Maven convention uses `SNAPSHOT` to represent a version of a project that is under development, while in SemVer, the development version is represented by a pre-release tag, it's a suffix added to the version that can indicate that the version is in `alpha`, `beta`, or `rc` stage.

The Maven versioning convention and semantic versioning share some similarities, but the meaning of the version numbers and the use of development versions are different. While Maven uses the incremental version number for bug fixes and other minor changes, SemVer uses the patch version number for this purpose. Additionally, Maven uses the SNAPSHOT to represent development versions, while SemVer uses pre-release tags.
