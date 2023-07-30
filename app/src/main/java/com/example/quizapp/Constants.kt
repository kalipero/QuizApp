package com.example.quizapp

object Constants {
    
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1. honduras
        //2. belgium
        //3. monaco
        //4. oman
        //5. czech
        //6. syria
        //7. venezuela
        //8. seychelles
        //9. bulgaria
        //10. uganda
        // ____________________________________________________________________________________

        // 1
        val que1 = Question(
            1, "What country does this flag belong?",
            R.drawable.honduras,
            "Venezuela","Pakistan","Honduras", "Austria", 3
        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong?",
            R.drawable.belgium,
            "Syria","Belgium","Deutchland", "Chad", 2
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong?",
            R.drawable.monaco,
            "Poland","Monaco","Indonesia", "Malta", 2
        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong?",
            R.drawable.oman,
            "Bulgaria","Palestine","Colombia", "Oman", 4
        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong?",
            R.drawable.czech,
            "Costa Rica","Finland","Czech", "El Salvador", 3
        )
        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong?",
            R.drawable.syria,
            "Syria","Afghanistan","Senegal", "Libya", 1
        )
        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong?",
            R.drawable.venezuela,
            "Armenia","Yemen","Colombia", "Venezuela", 4
        )
        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong?",
            R.drawable.seychelles,
            "Trinidad and Tobago","Seychelles","Antigua and Barbuda", "Bhutan", 2
        )
        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong?",
            R.drawable.bulgaria,
            "Bulgaria","Ghana","Mali", "Oman", 1
        )
        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong?",
            R.drawable.uganda,
            "Pakistan","Montenegro","Uganda", "Dominica", 3
        )
        questionList.add(que10)
        return questionList
    }
}