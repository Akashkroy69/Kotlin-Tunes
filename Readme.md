# Kotlin Tunes
### 1. Problem Description:

Your task is to write classes and interfaces to represent musical tunes and a collection of tunes in Kotlin. A tune consists of notes, where each note has a pitch and a duration. Implement:

- Note class: Represents a musical note with pitch and duration.
- Tune interface: Captures services provided by a tune.
- Implementations of Tune interface: StandardTune, TransposedTune, StretchedTune, and ThreadSafeTune.
- Song class: Represents a song with a name and a tune.
- SongCollection class: Organizes songs as a binary search tree, sorted by song name.

### 2. Getting Started:

- Organize code under `src/main/kotlin` in appropriate `tunes` package.
- Tests should be under `src/test/kotlin/tunes`.
- Additional methods or classes can be added following object-oriented principles.
- New files should be placed in the `tunes` package.

### 3. Note Class:

- Represented by pitch (integer) and duration (double).
- Validate pitch (0-200) and duration (0-64.0) in constructor.
- Make Note immutable, disallow subclasses.
- Provide read access to pitch and duration.
- Implement additional methods `hasNoteAbove()`, `hasNoteBelow()`, `noteAbove()`, and `noteBelow()`.

### 4. Tune Interface:

- Define `Tune` interface with methods:
    - `getNotes()` to access list of notes.
    - `totalDuration` property to get sum of note durations.
    - `addNote()` to add a note to the tune.
    - Default method for iterating over notes.

### 5. Transposing Tunes:

- Write `TransposedTune` class implementing Tune interface.
- Transpose pitch of each note by a specified amount.
- Ensure notes of the target tune remain unchanged.
- Handle out-of-range pitch values by adjusting to min/max allowed pitch.

### 6. Stretching Tunes (Java):

- Implement `StretchedTune` class in Java implementing Tune interface.
- Scale duration of each note by a given factor.
- Ensure notes of the target tune remain unchanged.
- Handle cases where scaled duration exceeds the maximum allowed duration.

### 7. Thread-Safe Tunes:

- Implement `ThreadSafeTune` class in Kotlin implementing Tune interface.
- Provide concurrent access to a target tune using locks.
- Write `Composer` class to add notes to a target tune in a multi-threaded environment.

### 8. Collection of Songs:

- Implement methods in `SongCollection` class to manage songs in a binary search tree.
- `addSong()` to insert a song.
- `getTune()` to retrieve a tune by song name.
- `getSongNames()` to get a sorted list of song names using in-order traversal.