package ew.fbcmt.myquizapp

object Constants {

    const val USER_NAME :String ="user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(


            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,"Argentina","Australia",
            "Armenia","Austria",1

        )
        questionsList.add(que1)


        val que2 = Question(


            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"Argentina","Australia",
            "Armenia","Austria",2

        )
        questionsList.add(que2)

        val que3 = Question(


            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"Belgium","Australia",
            "Armenia","Austria",1

        )
        questionsList.add(que3)

        val que4 = Question(


            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Argentina","Australia",
            "Armenia","Brazil",4

        )
        questionsList.add(que4)

        val que5 = Question(


            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"Denmark","India",
            "Armenia","Austria",1

        )
        questionsList.add(que5)

        val que6 = Question(


            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"India","Fiji",
            "Pakistan","Austria",2

        )
        questionsList.add(que6)

        val que7 = Question(


            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"Argentina","Australia",
            "Germany","Austria",3

        )
        questionsList.add(que7)

        val que8 = Question(


            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,"Argentina","Australia",
            "India","Austria",3

        )
        questionsList.add(que8)

        val que9 = Question(


            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"Argentina","Australia",
            "Armenia","Kuwait",4

        )
        questionsList.add(que9)



        return questionsList
    }


}