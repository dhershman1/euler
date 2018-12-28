module Main exposing (main)

import Browser
import Html exposing (..)
import Html.Attributes exposing (..)
import Problem001 exposing (sumMultiples)



-- Since Main.elm has the primary job of just collecting the results and displaying them
-- It doesn't need to do much else


type Msg
    = NoOp


type alias Model =
    { resOne : String
    }


init : Model
init =
    { resOne = String.fromInt (sumMultiples 999) }


update : Msg -> Model -> Model
update msg model =
    case msg of
        NoOp ->
            model


titleStyle : List (Attribute msg)
titleStyle =
    [ style "font-size" "1rem"
    , style "font-weight" "600"
    ]


view : Model -> Html Msg
view model =
    div []
        [ span titleStyle [ text "Problem 001: " ]
        , span [] [ text model.resOne ]
        ]


main : Program () Model Msg
main =
    Browser.sandbox { init = init, view = view, update = update }
