package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvc {
    private long d;
    private boolean h;
    private boolean i;
    private defpackage.cpm j;
    private defpackage.cpm k;
    private boolean l;
    private boolean m;
    public final android.util.SparseLongArray a = new android.util.SparseLongArray();
    public final android.util.SparseBooleanArray b = new android.util.SparseBooleanArray();
    private final java.util.List e = new java.util.ArrayList();
    public final defpackage.adb c = new defpackage.adb(10);
    private int f = -1;
    private int g = -1;

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    private final cvo g(defpackage.cvv cvvVar, android.view.MotionEvent motionEvent, defpackage.cpm cpmVar, int i, boolean z) {
        long j;
        long jFloatToRawIntBits;
        long jL;
        int i2;
        float fFloatValue;
        long jFloatToRawIntBits2;
        java.lang.Float f;
        long jA = a(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(x);
        long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(y);
        if (i == 0) {
            if (cpmVar != null) {
                jFloatToRawIntBits = cpmVar.a;
                j = 4294967295L;
            } else {
                j = 4294967295L;
                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
            }
            jL = cvvVar.l(jFloatToRawIntBits);
        } else {
            j = 4294967295L;
            if (cpmVar != null) {
                jFloatToRawIntBits = cpmVar.a;
            } else {
                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m(motionEvent, i))) << 32) | (((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, i))) & 4294967295L);
            }
            jL = cvvVar.l(jFloatToRawIntBits);
        }
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            i2 = 2;
            if (toolType != 1) {
                if (toolType == 2) {
                    i2 = 3;
                } else if (toolType != 3) {
                    i2 = 4;
                    if (toolType != 4) {
                        i2 = 0;
                    }
                }
            } else if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.h && !this.i)) {
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i3 = 0;
        while (true) {
            fFloatValue = 1.0f;
            jFloatToRawIntBits2 = 0;
            if (i3 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY = motionEvent.getHistoricalY(i, i3);
            if ((java.lang.Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i2 = i2;
                i3 = i3;
            } else {
                long jFloatToRawIntBits5 = ((long) java.lang.Float.floatToRawIntBits(historicalX)) << 32;
                long jFloatToRawIntBits6 = ((long) java.lang.Float.floatToRawIntBits(historicalY)) & j;
                boolean z2 = android.os.Build.VERSION.SDK_INT >= 34 && (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3 || this.l);
                long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                java.lang.Float fValueOf = java.lang.Float.valueOf(motionEvent.getHistoricalAxisValue(52, i, i3));
                f = fValueOf.floatValue() > 0.0f ? fValueOf : null;
                float fFloatValue2 = f != null ? f.floatValue() : 1.0f;
                if (z2) {
                    jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3))) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3))) & j);
                }
                long j2 = jFloatToRawIntBits5 | jFloatToRawIntBits6;
                arrayList.add(new cuy(historicalEventTime, j2, fFloatValue2, jFloatToRawIntBits2, j2));
            }
            i3++;
            i2 = i2;
            jL = jL;
        }
        int i4 = i2;
        long j3 = jL;
        long jFloatToRawIntBits7 = motionEvent.getActionMasked() == 8 ? (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32) | (((long) java.lang.Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j) : 0L;
        if (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5) {
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(motionEvent.getAxisValue(52, i));
            f = fValueOf2.floatValue() > 0.0f ? fValueOf2 : null;
            if (f != null) {
                fFloatValue = f.floatValue();
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 34 && (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3 || this.l)) {
            jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j);
        }
        return new cvo(jA, motionEvent.getEventTime(), jFloatToRawIntBits, j3, z, pressure, i4, this.b.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits7, fFloatValue, jFloatToRawIntBits2, (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & j));
    }

    private final void h() {
        this.h = false;
        this.i = false;
        this.j = null;
        this.l = false;
        this.m = false;
    }

    public final long a(int i) {
        android.util.SparseLongArray sparseLongArray = this.a;
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseLongArray.valueAt(iIndexOfKey);
        }
        long j = this.d;
        this.d = 1 + j;
        sparseLongArray.put(i, j);
        return j;
    }

    public final void b(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                android.util.SparseLongArray sparseLongArray = this.a;
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j = this.d;
                    this.d = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        android.util.SparseLongArray sparseLongArray2 = this.a;
        if (sparseLongArray2.indexOfKey(pointerId2) < 0) {
            long j2 = this.d;
            this.d = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.b.put(pointerId2, true);
            }
        }
    }

    public final void c(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (source == 8194 || source == 1048584) {
                if (source == this.g && (toolType == this.f || toolType == 3 || toolType == 1)) {
                    return;
                }
            } else if (toolType == this.f && source == this.g) {
                return;
            }
            this.f = toolType;
            this.g = source;
            this.b.clear();
            this.a.clear();
            h();
            this.k = null;
        }
    }

    public final void d(int i) {
        this.b.delete(i);
        this.a.delete(i);
    }

    public final void e(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            android.util.SparseBooleanArray sparseBooleanArray = this.b;
            if (!sparseBooleanArray.get(pointerId, false)) {
                this.a.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        android.util.SparseLongArray sparseLongArray = this.a;
        if (sparseLongArray.size() <= motionEvent.getPointerCount()) {
            return;
        }
        int size = sparseLongArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            int iKeyAt = sparseLongArray.keyAt(size);
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (true) {
                if (i >= pointerCount) {
                    sparseLongArray.removeAt(size);
                    this.b.delete(iKeyAt);
                    break;
                } else if (motionEvent.getPointerId(i) == iKeyAt) {
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x023e  */
    public final wj f(android.view.MotionEvent motionEvent, defpackage.cvv cvvVar) {
        int i;
        boolean z;
        char c;
        int actionIndex;
        int i2;
        boolean z2;
        defpackage.cpm cpmVar;
        long jFloatToRawIntBits;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            int i3 = 4;
            if (actionMasked != 4) {
                c(motionEvent);
                if (actionMasked == 0) {
                    if (android.os.Build.VERSION.SDK_INT < 34 || (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) != 3 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) != 5)) {
                        h();
                    }
                    actionMasked = 0;
                }
                if (actionMasked == 0 || actionMasked == 5) {
                    this.m = true;
                }
                if (actionMasked == 9 || actionMasked == 7) {
                    i = actionMasked;
                    z = true;
                } else if (actionMasked == 10) {
                    z = true;
                    i = 10;
                } else {
                    i = actionMasked;
                    z = false;
                }
                if ((i == 9 || i == 10 || (i == 7 && !this.m)) && (android.os.Build.VERSION.SDK_INT < 34 || (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) != 3 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) != 5))) {
                    h();
                }
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    if (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3) {
                        this.l = true;
                    } else if (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5) {
                        this.l = false;
                    }
                }
                b(motionEvent);
                if (!z || this.m) {
                    c = ' ';
                } else {
                    c = ' ';
                    this.b.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                    if (i == 7 || i == 9) {
                        this.k = new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L));
                    }
                }
                if (i != 1) {
                    actionIndex = i != 6 ? -1 : motionEvent.getActionIndex();
                } else {
                    actionIndex = 0;
                }
                java.util.List list = this.e;
                list.clear();
                if (motionEvent.getActionMasked() == 0) {
                    boolean z3 = android.os.Build.VERSION.SDK_INT >= 34 && (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3 || da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5);
                    boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                    if (z3 || z4) {
                        this.h = true;
                    }
                }
                boolean z5 = android.os.Build.VERSION.SDK_INT >= 34 && (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3 || this.l);
                boolean z6 = android.os.Build.VERSION.SDK_INT >= 34 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5 && ((motionEvent.getActionMasked() == 0 && this.k != null) || (motionEvent.getActionMasked() != 0 && this.i));
                if (android.os.Build.VERSION.SDK_INT < 34 || !(z5 || z6)) {
                    i2 = 2;
                    boolean z7 = false;
                    this.i = false;
                    int pointerCount = motionEvent.getPointerCount();
                    int i4 = 0;
                    while (i4 < pointerCount) {
                        list.add(g(cvvVar, motionEvent, null, i4, (z || i4 == actionIndex || (i == 8 && motionEvent.getButtonState() == 0)) ? z7 : true));
                        i4++;
                        pointerCount = pointerCount;
                        z7 = z7;
                    }
                    z2 = z7;
                } else {
                    this.i = true;
                    if (motionEvent.getActionMasked() == 5 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5 && motionEvent.getPointerCount() == 2) {
                        cpmVar = new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits((da$.ExternalSyntheticApiModelOutline0.m(motionEvent, 0) + da$.ExternalSyntheticApiModelOutline0.m(motionEvent, 1)) / 2.0f)) << c) | (((long) java.lang.Float.floatToRawIntBits((da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, 0) + da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, 1)) / 2.0f)) & 4294967295L));
                        this.j = cpmVar;
                    } else if (motionEvent.getActionMasked() == 0 || (cpmVar = this.j) == null) {
                        if (da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 5) {
                            defpackage.cpm cpmVar2 = this.k;
                            if (cpmVar2 != null) {
                                jFloatToRawIntBits = cpmVar2.a;
                            } else {
                                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, 0))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m(motionEvent, 0))) << c);
                            }
                            cpmVar = new defpackage.cpm(jFloatToRawIntBits);
                        } else {
                            cpmVar = new defpackage.cpm((((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m(motionEvent, 0))) << c) | (((long) java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, 0))) & 4294967295L));
                        }
                        this.j = cpmVar;
                    }
                    i2 = 2;
                    list.add(g(cvvVar, motionEvent, cpmVar, 0, false));
                    z2 = false;
                }
                if (this.l) {
                    i3 = 5;
                } else if (android.os.Build.VERSION.SDK_INT < 34) {
                    i3 = 1;
                } else {
                    int iM = da$.ExternalSyntheticApiModelOutline0.m(motionEvent);
                    if (iM == 1) {
                        i3 = i2;
                    } else if (iM == i2) {
                        i3 = 3;
                    } else if (iM == 3) {
                        i3 = 5;
                    } else if (iM != 5) {
                        i3 = 1;
                    }
                }
                if (motionEvent.getActionMasked() == 10 && (android.os.Build.VERSION.SDK_INT < 34 || da$.ExternalSyntheticApiModelOutline0.m(motionEvent) != 3)) {
                    z2 = true;
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3 || z2) {
                    h();
                }
                e(motionEvent);
                motionEvent.getEventTime();
                return new wj(list, motionEvent, i3);
            }
        }
        this.a.clear();
        this.b.clear();
        h();
        this.k = null;
        return null;
    }
}
