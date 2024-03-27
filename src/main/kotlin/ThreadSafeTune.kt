class ThreadSafeTune:Tune {

    private val lock = Any()

    override fun getNotes(): List<Note> {
        TODO("Not yet implemented")
    }
}