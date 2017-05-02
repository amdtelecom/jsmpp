/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.jsmpp.util;

/**
 * @author uudashr
 * @version 1.0
 * @since 1.0
 *
 */
public enum DeliveryReceiptState {
    /**
     * ENROUTE
     */
    ENROUTE(0,false),
    /**
     * DELIVERED
     */
    DELIVRD(1,true),
    /**
     * EXPIRED
     */
    EXPIRED(2,true),
    /**
     * DELETED
     */
    DELETED(3,true),
    /**
     * UNDELIVERABLE
     */
    UNDELIV(4,true),
    /**
     * ACCEPTED
     */
    ACCEPTD(5,false),
    /**
     * UNKNOWN
     */
    UNKNOWN(6,true),
    /**
     * REJECTED
     */
    REJECTD(7,true),
    /**
     * BUFFERD
     */
    BUFFERD(8,false),
    /**
     * FAILED
     */
    FAILED(9,true),
    /**
     * FAILURE
     */
    FAILURE(10,true),
    /**
     * FNOTSUP
     */
    FNOTSUP(11,true),
    /**
     * INVALID
     */
    INVALID(12,true),
    /**
     * UNDELIVERABLE
     */
    UNDELIVERABLE(13,true),
    /**
     * QUEUED
     */
    QUEUED(14,false),
    /**
     * SUBMITTED_TO_ROUTEE
     */
    SUBMITTED_TO_ROUTEE(15,false),
    /**
     * PROCCESSING_MESSAGE
     */
    PROCCESSING_MESSAGE(16,false),
    /**
     * WRITTEN_TO_SQL_BOX
     */
    WRITTEN_TO_SQL_BOX(17,false);

    private int value;
    private boolean isFinal;

    DeliveryReceiptState(int value, boolean isFinal) {
        this.value = value;
        this.isFinal = isFinal;
    }

    public static DeliveryReceiptState getByName(String name) {
        return valueOf(DeliveryReceiptState.class, name);
    }

    public static DeliveryReceiptState valueOf(int value)
            throws IllegalArgumentException {
        for (DeliveryReceiptState item : values()) {
            if (item.value() == value) {
                return item;
            }
        }
        throw new IllegalArgumentException(
                "No enum const DeliveryReceiptState with value " + value);
    }

    public int value() {
        return value;
    }

    public boolean isFinal() {
        return isFinal;
    }

}
