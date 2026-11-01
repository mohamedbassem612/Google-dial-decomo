package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvf {
    public final java.util.List a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public final aae f;

    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    public cvf(java.util.List list, aae aaeVar) {
        this.a = list;
        this.f = aaeVar;
        android.view.MotionEvent motionEventA = a();
        int i = 0;
        this.b = motionEventA != null ? da$.ExternalSyntheticApiModelOutline0.m(motionEventA) : 0;
        android.view.MotionEvent motionEventA2 = a();
        this.c = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        android.view.MotionEvent motionEventA3 = a();
        this.d = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        android.view.MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int iC = aaeVar != null ? aaeVar.c() : 0;
            int iC2 = aaeVar != null ? aaeVar.c() : 0;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (iC == 5) {
                                    i = 10;
                                } else if (iC2 != 4) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                                break;
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (iC == 5) {
                                    i = 12;
                                } else if (iC2 != 4) {
                                    i = 2;
                                } else {
                                    i = 8;
                                }
                                break;
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (iC == 5) {
                                    i = 11;
                                } else if (iC2 != 4) {
                                    i = 3;
                                } else {
                                    i = 8;
                                }
                                break;
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    } else if (iC == 5) {
                        i = 11;
                    } else if (iC2 != 4) {
                        i = 8;
                    } else {
                        i = 3;
                    }
                } else if (iC == 5) {
                    i = 12;
                } else if (iC2 == 4) {
                    i = 9;
                } else {
                    i = 2;
                }
            } else if (iC == 5) {
                i = 10;
            } else if (iC2 == 4) {
                i = 7;
            } else {
                i = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    cvm cvmVar = (cvm) list.get(i);
                    if (defpackage.uu.t(cvmVar)) {
                        i = 2;
                    } else if (defpackage.uu.r(cvmVar)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.e = i;
    }

    public final android.view.MotionEvent a() {
        aae aaeVar = this.f;
        if (aaeVar != null) {
            return aaeVar.a();
        }
        return null;
    }
}
