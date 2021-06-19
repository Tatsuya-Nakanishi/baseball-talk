package com.example.baseballtalk1.exception.handler;

//import com.example.web.exception.response.ErrorResponse;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * ResponseStatusExceptionをハンドリングする
     */
//    @ExceptionHandler
//    public ResponseEntity<Object> handleResponseStatus(ResponseStatusException ex) {
//        ErrorResponse errorResponse = new ErrorResponse(ex.getReason());
//        return ResponseEntity.status(ex.getStatus()).body(errorResponse);
//    }
//
//    /**
//     * リクエストボディのJSON変換時に発生した例外をハンドリングする
//     */
//    @Override
//    protected ResponseEntity<Object> handleHttpMessageNotReadable(
//            HttpMessageNotReadableException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//        ErrorResponse errorResponse = new ErrorResponse("JSONの型変換エラーが発生しました。");
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//    }
//
//    /**
//     * パスやクエリパラメータの型変換で発生した例外をハンドリングする
//     */
//    @Override
//    protected ResponseEntity<Object> handleTypeMismatch(
//            TypeMismatchException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//        ErrorResponse errorResponse = new ErrorResponse("引数の型変換エラーが発生しました。");
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//    }
//
//    /**
//     * バリデーション時に発生した例外をハンドリングする
//     */
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//        // Requestクラスのフィールドの全検証エラーを取得する
//        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
//        ErrorResponse errorResponse = new ErrorResponse("入力エラー");
//        // ErrorResponseに、フィールドの全検証エラーを追加
//        for (FieldError fieldError : fieldErrors) {
//            // エラーが起こったフィールド名と、それに対応するエラーメッセージを追加
//            errorResponse.addDetail(fieldError.getField(), fieldError.getDefaultMessage());
//        }
//        // 400 Bad Requestでレスポンス
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//    }
}
