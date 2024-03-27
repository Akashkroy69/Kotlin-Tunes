data class Note(val pitch:Int,val duration:Double){
    init {
        require(pitch >= 0 && pitch <= 200) { "Pitch must be non-negative and no larger than 200" }
        require(duration > 0 && duration <= 64.0) { "Duration must be positive and no larger than 64.0" }
    }

    @JvmName("getPitch1")
    fun getPitch(): Int {
        return pitch
    }

    @JvmName("getDuration1")
    fun getDuration(): Double {
        return duration
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Note) return false
        return pitch == other.pitch && duration == other.duration
    }

    override fun hashCode(): Int {
        var result = pitch
        result = 31 * result + duration.hashCode()
        return result
    }

    fun hasNoteAbove(): Boolean{
        return TODO()
    }

    fun hasNoteBelow(): Boolean{
        return TODO()
    }
    fun noteAbove(): Note{
        return TODO()
    }
    fun noteBelow(): Note{
        return TODO()
    }
}
