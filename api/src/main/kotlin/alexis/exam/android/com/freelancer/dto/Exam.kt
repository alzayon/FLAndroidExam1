package alexis.exam.android.com.freelancer.dto

import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Created by alzayon on 9/27/2017.
 */
class Exam @JsonCreator constructor(val name : String, val progress : Float) {

}