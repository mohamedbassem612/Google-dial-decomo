package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbt {
    public defpackage.hbd a;
    public defpackage.hbd b;
    public defpackage.hbd c;
    public defpackage.hbd d;
    public defpackage.hbd e;
    public defpackage.hbh f;
    public defpackage.hbh g;
    public defpackage.hbd h;
    public defpackage.hbd i;
    private final android.graphics.Matrix j = new android.graphics.Matrix();
    private final android.graphics.Matrix k;
    private final android.graphics.Matrix l;
    private final android.graphics.Matrix m;
    private final float[] n;
    private final boolean o;

    public hbt(defpackage.hdk hdkVar) {
        defpackage.hde hdeVar = hdkVar.a;
        this.a = hdeVar == null ? null : hdeVar.a();
        defpackage.hdl hdlVar = hdkVar.b;
        this.b = hdlVar == null ? null : hdlVar.a();
        defpackage.hdg hdgVar = hdkVar.c;
        this.c = hdgVar == null ? null : hdgVar.a();
        defpackage.hdb hdbVar = hdkVar.d;
        this.d = hdbVar == null ? null : hdbVar.a();
        defpackage.hdb hdbVar2 = hdkVar.f;
        this.f = (defpackage.hbh) (hdbVar2 == null ? null : hdbVar2.a());
        this.o = hdkVar.j;
        if (this.f != null) {
            this.k = new android.graphics.Matrix();
            this.l = new android.graphics.Matrix();
            this.m = new android.graphics.Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        defpackage.hdb hdbVar3 = hdkVar.g;
        this.g = (defpackage.hbh) (hdbVar3 == null ? null : hdbVar3.a());
        defpackage.hdd hddVar = hdkVar.e;
        if (hddVar != null) {
            this.e = hddVar.a();
        }
        defpackage.hdb hdbVar4 = hdkVar.h;
        if (hdbVar4 != null) {
            this.h = hdbVar4.a();
        } else {
            this.h = null;
        }
        defpackage.hdb hdbVar5 = hdkVar.i;
        if (hdbVar5 != null) {
            this.i = hdbVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final android.graphics.Matrix a() {
        android.graphics.PointF pointF;
        defpackage.hgq hgqVar;
        android.graphics.PointF pointF2;
        android.graphics.Matrix matrix = this.j;
        matrix.reset();
        defpackage.hbd hbdVar = this.b;
        if (hbdVar != null && (pointF2 = (android.graphics.PointF) hbdVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        if (!this.o) {
            defpackage.hbd hbdVar2 = this.d;
            if (hbdVar2 != null) {
                float fFloatValue = hbdVar2 instanceof defpackage.hbu ? ((java.lang.Float) hbdVar2.e()).floatValue() : ((defpackage.hbh) hbdVar2).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (hbdVar != null) {
            float f = hbdVar.c;
            android.graphics.PointF pointF3 = (android.graphics.PointF) hbdVar.e();
            float f2 = pointF3.x;
            float f3 = pointF3.y;
            hbdVar.j(1.0E-4f + f);
            android.graphics.PointF pointF4 = (android.graphics.PointF) hbdVar.e();
            hbdVar.j(f);
            matrix.preRotate((float) java.lang.Math.toDegrees(java.lang.Math.atan2(pointF4.y - f3, pointF4.x - f2)));
        }
        defpackage.hbh hbhVar = this.f;
        if (hbhVar != null) {
            defpackage.hbh hbhVar2 = this.g;
            float fCos = hbhVar2 == null ? 0.0f : (float) java.lang.Math.cos(java.lang.Math.toRadians((-hbhVar2.k()) + 90.0f));
            defpackage.hbh hbhVar3 = this.g;
            float fSin = hbhVar3 == null ? 1.0f : (float) java.lang.Math.sin(java.lang.Math.toRadians((-hbhVar3.k()) + 90.0f));
            float fTan = (float) java.lang.Math.tan(java.lang.Math.toRadians(hbhVar.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f4 = -fSin;
            fArr[3] = f4;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            android.graphics.Matrix matrix2 = this.k;
            matrix2.setValues(fArr);
            f();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            android.graphics.Matrix matrix3 = this.l;
            matrix3.setValues(fArr);
            f();
            fArr[0] = fCos;
            fArr[1] = f4;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            android.graphics.Matrix matrix4 = this.m;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        defpackage.hbd hbdVar3 = this.c;
        if (hbdVar3 != null && (hgqVar = (defpackage.hgq) hbdVar3.e()) != null) {
            float f5 = hgqVar.a;
            if (f5 != 1.0f || hgqVar.b != 1.0f) {
                matrix.preScale(f5, hgqVar.b);
            }
        }
        defpackage.hbd hbdVar4 = this.a;
        if (hbdVar4 != null && (pointF = (android.graphics.PointF) hbdVar4.e()) != null && (pointF.x != 0.0f || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final android.graphics.Matrix b(float f) {
        float f2;
        float f3;
        defpackage.hbd hbdVar = this.b;
        android.graphics.PointF pointF = hbdVar == null ? null : (android.graphics.PointF) hbdVar.e();
        defpackage.hbd hbdVar2 = this.c;
        defpackage.hgq hgqVar = hbdVar2 == null ? null : (defpackage.hgq) hbdVar2.e();
        android.graphics.Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (hgqVar != null) {
            double d = f;
            matrix.preScale((float) java.lang.Math.pow(hgqVar.a, d), (float) java.lang.Math.pow(hgqVar.b, d));
        }
        defpackage.hbd hbdVar3 = this.d;
        if (hbdVar3 != null) {
            float fFloatValue = ((java.lang.Float) hbdVar3.e()).floatValue();
            defpackage.hbd hbdVar4 = this.a;
            android.graphics.PointF pointF2 = hbdVar4 != null ? (android.graphics.PointF) hbdVar4.e() : null;
            float f4 = fFloatValue * f;
            if (pointF2 == null) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
                f3 = pointF2.y;
            }
            matrix.preRotate(f4, f2, f3);
        }
        return matrix;
    }

    public final void c(defpackage.hef hefVar) {
        hefVar.i(this.e);
        hefVar.i(this.h);
        hefVar.i(this.i);
        hefVar.i(this.a);
        hefVar.i(this.b);
        hefVar.i(this.c);
        hefVar.i(this.d);
        hefVar.i(this.f);
        hefVar.i(this.g);
    }

    public final void d(defpackage.hay hayVar) {
        defpackage.hbd hbdVar = this.e;
        if (hbdVar != null) {
            hbdVar.h(hayVar);
        }
        defpackage.hbd hbdVar2 = this.h;
        if (hbdVar2 != null) {
            hbdVar2.h(hayVar);
        }
        defpackage.hbd hbdVar3 = this.i;
        if (hbdVar3 != null) {
            hbdVar3.h(hayVar);
        }
        defpackage.hbd hbdVar4 = this.a;
        if (hbdVar4 != null) {
            hbdVar4.h(hayVar);
        }
        defpackage.hbd hbdVar5 = this.b;
        if (hbdVar5 != null) {
            hbdVar5.h(hayVar);
        }
        defpackage.hbd hbdVar6 = this.c;
        if (hbdVar6 != null) {
            hbdVar6.h(hayVar);
        }
        defpackage.hbd hbdVar7 = this.d;
        if (hbdVar7 != null) {
            hbdVar7.h(hayVar);
        }
        defpackage.hbh hbhVar = this.f;
        if (hbhVar != null) {
            hbhVar.h(hayVar);
        }
        defpackage.hbh hbhVar2 = this.g;
        if (hbhVar2 != null) {
            hbhVar2.h(hayVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118 A[ORIG_RETURN, RETURN] */
    public final boolean e(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbh hbhVar;
        defpackage.hbh hbhVar2;
        defpackage.hbd hbdVar;
        defpackage.hbd hbdVar2;
        defpackage.hbd hbdVar3;
        defpackage.hbd hbdVar4;
        defpackage.hbd hbdVar5;
        defpackage.hbd hbdVar6;
        if (obj == defpackage.gzx.f) {
            defpackage.hbd hbdVar7 = this.a;
            if (hbdVar7 == null) {
                this.a = new defpackage.hbu(hgpVar, new android.graphics.PointF());
            } else {
                hbdVar7.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.g) {
            defpackage.hbd hbdVar8 = this.b;
            if (hbdVar8 == null) {
                this.b = new defpackage.hbu(hgpVar, new android.graphics.PointF());
            } else {
                hbdVar8.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.h) {
            defpackage.hbd hbdVar9 = this.b;
            if (hbdVar9 instanceof defpackage.hbq) {
                defpackage.hbq hbqVar = (defpackage.hbq) hbdVar9;
                defpackage.hgp hgpVar2 = hbqVar.e;
                hbqVar.e = hgpVar;
            } else if (obj == defpackage.gzx.i) {
                hbdVar6 = this.b;
                if (hbdVar6 instanceof defpackage.hbq) {
                    defpackage.hbq hbqVar2 = (defpackage.hbq) hbdVar6;
                    defpackage.hgp hgpVar3 = hbqVar2.f;
                    hbqVar2.f = hgpVar;
                } else if (obj == defpackage.gzx.o) {
                    hbdVar5 = this.c;
                    if (hbdVar5 == null) {
                        this.c = new defpackage.hbu(hgpVar, new defpackage.hgq(1.0f, 1.0f));
                    } else {
                        hbdVar5.d = hgpVar;
                    }
                } else if (obj == defpackage.gzx.p) {
                    hbdVar4 = this.d;
                    if (hbdVar4 == null) {
                        this.d = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(0.0f));
                    } else {
                        hbdVar4.d = hgpVar;
                    }
                } else if (obj == defpackage.gzx.c) {
                    hbdVar3 = this.e;
                    if (hbdVar3 == null) {
                        this.e = new defpackage.hbu(hgpVar, 100);
                    } else {
                        hbdVar3.d = hgpVar;
                    }
                } else if (obj == defpackage.gzx.C) {
                    hbdVar2 = this.h;
                    if (hbdVar2 == null) {
                        this.h = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                    } else {
                        hbdVar2.d = hgpVar;
                    }
                } else if (obj == defpackage.gzx.D) {
                    hbdVar = this.i;
                    if (hbdVar == null) {
                        this.i = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                    } else {
                        hbdVar.d = hgpVar;
                    }
                } else if (obj == defpackage.gzx.q) {
                    hbhVar2 = this.f;
                    if (hbhVar2 == null) {
                        hbhVar2 = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                        this.f = hbhVar2;
                    }
                    hbhVar2.d = hgpVar;
                } else {
                    if (obj == defpackage.gzx.r) {
                        return false;
                    }
                    hbhVar = this.g;
                    if (hbhVar == null) {
                        hbhVar = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                        this.g = hbhVar;
                    }
                    hbhVar.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.o) {
                hbdVar5 = this.c;
                if (hbdVar5 == null) {
                    this.c = new defpackage.hbu(hgpVar, new defpackage.hgq(1.0f, 1.0f));
                } else {
                    hbdVar5.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.p) {
                hbdVar4 = this.d;
                if (hbdVar4 == null) {
                    this.d = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(0.0f));
                } else {
                    hbdVar4.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.c) {
                hbdVar3 = this.e;
                if (hbdVar3 == null) {
                    this.e = new defpackage.hbu(hgpVar, 100);
                } else {
                    hbdVar3.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.C) {
                hbdVar2 = this.h;
                if (hbdVar2 == null) {
                    this.h = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                } else {
                    hbdVar2.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.D) {
                hbdVar = this.i;
                if (hbdVar == null) {
                    this.i = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                } else {
                    hbdVar.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.q) {
                hbhVar2 = this.f;
                if (hbhVar2 == null) {
                    hbhVar2 = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                    this.f = hbhVar2;
                }
                hbhVar2.d = hgpVar;
            } else {
                if (obj == defpackage.gzx.r) {
                    return false;
                }
                hbhVar = this.g;
                if (hbhVar == null) {
                    hbhVar = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                    this.g = hbhVar;
                }
                hbhVar.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.i) {
            hbdVar6 = this.b;
            if (hbdVar6 instanceof defpackage.hbq) {
                defpackage.hbq hbqVar3 = (defpackage.hbq) hbdVar6;
                defpackage.hgp hgpVar4 = hbqVar3.f;
                hbqVar3.f = hgpVar;
            } else if (obj == defpackage.gzx.o) {
                hbdVar5 = this.c;
                if (hbdVar5 == null) {
                    this.c = new defpackage.hbu(hgpVar, new defpackage.hgq(1.0f, 1.0f));
                } else {
                    hbdVar5.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.p) {
                hbdVar4 = this.d;
                if (hbdVar4 == null) {
                    this.d = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(0.0f));
                } else {
                    hbdVar4.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.c) {
                hbdVar3 = this.e;
                if (hbdVar3 == null) {
                    this.e = new defpackage.hbu(hgpVar, 100);
                } else {
                    hbdVar3.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.C) {
                hbdVar2 = this.h;
                if (hbdVar2 == null) {
                    this.h = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                } else {
                    hbdVar2.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.D) {
                hbdVar = this.i;
                if (hbdVar == null) {
                    this.i = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
                } else {
                    hbdVar.d = hgpVar;
                }
            } else if (obj == defpackage.gzx.q) {
                hbhVar2 = this.f;
                if (hbhVar2 == null) {
                    hbhVar2 = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                    this.f = hbhVar2;
                }
                hbhVar2.d = hgpVar;
            } else {
                if (obj == defpackage.gzx.r) {
                    return false;
                }
                hbhVar = this.g;
                if (hbhVar == null) {
                    hbhVar = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                    this.g = hbhVar;
                }
                hbhVar.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.o) {
            hbdVar5 = this.c;
            if (hbdVar5 == null) {
                this.c = new defpackage.hbu(hgpVar, new defpackage.hgq(1.0f, 1.0f));
            } else {
                hbdVar5.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.p) {
            hbdVar4 = this.d;
            if (hbdVar4 == null) {
                this.d = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(0.0f));
            } else {
                hbdVar4.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.c) {
            hbdVar3 = this.e;
            if (hbdVar3 == null) {
                this.e = new defpackage.hbu(hgpVar, 100);
            } else {
                hbdVar3.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.C) {
            hbdVar2 = this.h;
            if (hbdVar2 == null) {
                this.h = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
            } else {
                hbdVar2.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.D) {
            hbdVar = this.i;
            if (hbdVar == null) {
                this.i = new defpackage.hbu(hgpVar, java.lang.Float.valueOf(100.0f));
            } else {
                hbdVar.d = hgpVar;
            }
        } else if (obj == defpackage.gzx.q) {
            hbhVar2 = this.f;
            if (hbhVar2 == null) {
                hbhVar2 = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                this.f = hbhVar2;
            }
            hbhVar2.d = hgpVar;
        } else {
            if (obj == defpackage.gzx.r) {
                return false;
            }
            hbhVar = this.g;
            if (hbhVar == null) {
                hbhVar = new defpackage.hbh(java.util.Collections.singletonList(new defpackage.hgn(java.lang.Float.valueOf(0.0f))));
                this.g = hbhVar;
            }
            hbhVar.d = hgpVar;
        }
        return true;
    }
}
