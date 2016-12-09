/*
 * Copyright: (c) 2016 Redfin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.redfin.patience;

/**
 * A PatientTimeoutException is an unchecked exception. It is intended to signal that
 * a timeout was reached without receiving a valid value.
 */
public class PatientTimeoutException extends RuntimeException {

    static final long serialVersionUID = 0L;

    /**
     * Constructs a new patience exception with {@code null} as its
     * detail message and cause.
     */
    public PatientTimeoutException() {
        super();
    }

    /**
     * Constructs a new patience exception with the specified detail message.
     * The cause will be {@code null}.
     *
     * @param message the detail message. If {@code null} then it is the same
     *                as calling {@link #PatientTimeoutException()}.
     */
    public PatientTimeoutException(String message) {
        super(message);
    }

    /**
     * Constructs a new patience exception with the specified detail message and
     * cause.
     *
     * @param message the detail message. If {@code null} then it is the same
     *                as calling {@link #PatientTimeoutException(Throwable)}.
     * @param cause   the cause of the exception. If {@code null} then it is the
     *                same as calling {@link #PatientTimeoutException(String)}.
     */
    public PatientTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new patience exception with the specified cause.
     * The message will be {@code null}.
     *
     * @param cause the cause of the exception. If {@code null} then it is the
     *              same as calling {@link #PatientTimeoutException()}.
     */
    public PatientTimeoutException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new patience exception with the specified detail
     * message, cause, suppression enabled or disabled, and writable
     * stack trace enabled or disabled.
     *
     * @param message            the detail message. If {@code null} then it is the
     *                           same as having been not set.
     * @param cause              the cause of the exception. If {@code null} then it is the
     *                           same as having been not set.
     * @param enableSuppression  whether or not suppression is enabled
     *                           or disabled.
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable.
     */
    protected PatientTimeoutException(String message,
                                      Throwable cause,
                                      boolean enableSuppression,
                                      boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}