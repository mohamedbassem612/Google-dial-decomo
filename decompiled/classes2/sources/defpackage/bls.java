package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bls implements aonj {
    final /* synthetic */ defpackage.blw a;

    public bls(defpackage.blw blwVar) {
        this.a = blwVar;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0256  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:297:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:303:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:307:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:309:0x04e4 A[PHI: r1
      0x04e4: PHI (r1v13 char) = (r1v12 char), (r1v19 char) binds: [B:46:0x00ab, B:78:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        char c;
        boolean z;
        android.view.KeyEvent keyEvent = ((defpackage.cui) obj).a;
        char c2 = 2;
        int i = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
        if (i == 9) {
            long jK = un.k(keyEvent);
            if (jK == un.h(21)) {
                c = '*';
            } else if (jK == un.h(22)) {
                c = '+';
            } else if (jK == un.h(19)) {
                c = '\"';
            } else if (jK == un.h(20)) {
                c = '#';
            } else {
                c = 0;
            }
        } else if (i == 1) {
            long jK2 = un.k(keyEvent);
            if (jK2 == un.h(21)) {
                c = '\t';
            } else if (jK2 == un.h(22)) {
                c = '\n';
            } else if (jK2 == un.h(19)) {
                c = 16;
            } else if (jK2 == un.h(20)) {
                c = 17;
            } else if (jK2 == un.h(67)) {
                c = 25;
            } else {
                c = 0;
            }
        } else {
            c = 0;
        }
        if (c == 0) {
            int i2 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2);
            int i3 = true != keyEvent.isMetaPressed() ? 0 : 4;
            int i4 = true != keyEvent.isShiftPressed() ? 0 : 8;
            long jK3 = un.k(keyEvent);
            int i5 = i2 | i3 | i4;
            if (jK3 == un.h(67)) {
                if (i5 == 0 || i5 == 8 || i5 == 12) {
                    c = 21;
                } else if (i5 == 2 || i5 == 10) {
                    c = 23;
                } else {
                    c = 0;
                }
            } else if ((jK3 == un.h(66) || jK3 == un.h(160)) && (i5 == 0 || i5 == 8 || i5 == 2 || i5 == 10)) {
                c = '-';
            } else {
                c = 0;
            }
            if (c == 0) {
                int i6 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
                char c3 = '$';
                if (i6 == 10) {
                    long jK4 = un.k(keyEvent);
                    if (jK4 != un.h(21) && jK4 != un.h(-1000000003)) {
                        if (jK4 == un.h(22) || jK4 == un.h(-1000000004)) {
                            c3 = '%';
                        } else if (jK4 == un.h(19) || jK4 == un.h(-1000000001)) {
                            c3 = '\'';
                        } else if (jK4 == un.h(20) || jK4 == un.h(-1000000002)) {
                            c3 = '&';
                        } else {
                            c3 = 0;
                        }
                    }
                } else if (i6 == 2) {
                    long jK5 = un.k(keyEvent);
                    if (jK5 == un.h(21) || jK5 == un.h(-1000000003)) {
                        c3 = 4;
                    } else if (jK5 == un.h(22) || jK5 == un.h(-1000000004)) {
                        c3 = 3;
                    } else if (jK5 == un.h(19) || jK5 == un.h(-1000000001)) {
                        c3 = 6;
                    } else if (jK5 == un.h(20) || jK5 == un.h(-1000000002)) {
                        c3 = 5;
                    } else if (jK5 == un.h(36)) {
                        c3 = 21;
                    } else if (jK5 == un.h(112)) {
                        c3 = 24;
                    } else if (jK5 == un.h(73)) {
                        c3 = ',';
                    } else {
                        c3 = 0;
                    }
                } else if (i6 == 8) {
                    long jK6 = un.k(keyEvent);
                    if (jK6 == un.h(122) || jK6 == un.h(-1000000005)) {
                        c3 = '(';
                    } else if (jK6 == un.h(123) || jK6 == un.h(-1000000006)) {
                        c3 = ')';
                    } else {
                        c3 = 0;
                    }
                } else if (i6 == 1 && un.k(keyEvent) == un.h(112)) {
                    c3 = 26;
                } else {
                    c3 = 0;
                }
                if (c3 == 0) {
                    int i7 = (keyEvent.isAltPressed() ? 1 : 0) | (true != keyEvent.isCtrlPressed() ? (char) 0 : (char) 2) | (true != keyEvent.isMetaPressed() ? 0 : 4) | (true != keyEvent.isShiftPressed() ? 0 : 8);
                    if (i7 == 10) {
                        if (un.k(keyEvent) == un.h(54)) {
                            c2 = '0';
                        } else {
                            c2 = 0;
                        }
                    } else if (i7 == 2) {
                        long jK7 = un.k(keyEvent);
                        if (jK7 == un.h(31) || jK7 == un.h(124) || jK7 == un.h(-1000000009)) {
                            c2 = 18;
                        } else if (jK7 == un.h(50)) {
                            c2 = 19;
                        } else if (jK7 == un.h(52)) {
                            c2 = 20;
                        } else if (jK7 == un.h(29)) {
                            c2 = 27;
                        } else if (jK7 == un.h(53)) {
                            c2 = '0';
                        } else if (jK7 == un.h(54)) {
                            c2 = '/';
                        } else {
                            c2 = 0;
                        }
                    } else if (i7 == 8) {
                        long jK8 = un.k(keyEvent);
                        if (jK8 == un.h(21) || jK8 == un.h(-1000000003)) {
                            c2 = 28;
                        } else if (jK8 == un.h(22) || jK8 == un.h(-1000000004)) {
                            c2 = 29;
                        } else if (jK8 == un.h(19) || jK8 == un.h(-1000000001)) {
                            c2 = 30;
                        } else if (jK8 == un.h(20) || jK8 == un.h(-1000000002)) {
                            c2 = 31;
                        } else if (jK8 == un.h(92) || jK8 == un.h(-1000000007)) {
                            c2 = ' ';
                        } else if (jK8 == un.h(93) || jK8 == un.h(-1000000008)) {
                            c2 = '!';
                        } else if (jK8 == un.h(122) || jK8 == un.h(-1000000005)) {
                            c2 = '(';
                        } else if (jK8 == un.h(123) || jK8 == un.h(-1000000006)) {
                            c2 = ')';
                        } else if (jK8 == un.h(124) || jK8 == un.h(-1000000009)) {
                            c2 = 19;
                        } else {
                            c2 = 0;
                        }
                    } else if (i7 == 0) {
                        long jK9 = un.k(keyEvent);
                        if (jK9 == un.h(21) || jK9 == un.h(-1000000003)) {
                            c2 = 1;
                        } else if (jK9 != un.h(22) && jK9 != un.h(-1000000004)) {
                            if (jK9 == un.h(19) || jK9 == un.h(-1000000001)) {
                                c2 = 11;
                            } else if (jK9 == un.h(20) || jK9 == un.h(-1000000002)) {
                                c2 = '\f';
                            } else if (jK9 == un.h(23)) {
                                c2 = '\r';
                            } else if (jK9 == un.h(92) || jK9 == un.h(-1000000007)) {
                                c2 = 14;
                            } else if (jK9 == un.h(93) || jK9 == un.h(-1000000008)) {
                                c2 = 15;
                            } else if (jK9 == un.h(122) || jK9 == un.h(-1000000005)) {
                                c2 = 7;
                            } else if (jK9 == un.h(123) || jK9 == un.h(-1000000006)) {
                                c2 = '\b';
                            } else if (jK9 == un.h(66) || jK9 == un.h(160)) {
                                c2 = '-';
                            } else if (jK9 == un.h(67)) {
                                c2 = 21;
                            } else if (jK9 == un.h(112)) {
                                c2 = 22;
                            } else if (jK9 == un.h(279)) {
                                c2 = 19;
                            } else if (jK9 == un.h(277)) {
                                c2 = 20;
                            } else if (jK9 == un.h(278)) {
                                c2 = 18;
                            } else if (jK9 == un.h(61)) {
                                c2 = '.';
                            } else {
                                c2 = 0;
                            }
                        }
                    } else {
                        c2 = 0;
                    }
                } else {
                    c2 = c3;
                }
            } else {
                c2 = c;
            }
        } else {
            c2 = c;
        }
        if (c2 == 18) {
            this.a.m();
            z = true;
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
