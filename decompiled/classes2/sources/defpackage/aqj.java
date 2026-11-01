package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aqj {
    public final int a;
    private final java.util.List b;
    private final float[] c;

    public aqj(java.util.List list, float[] fArr) {
        aokc aokcVarSingletonList;
        this.b = list;
        this.c = fArr;
        int size = list.size();
        int length = fArr.length;
        if (size != length) {
            if (fArr == null) {
                aooh.i("<this>");
            }
            if (length != 0) {
                if (length != 1) {
                    if (fArr == null) {
                        aooh.i("<this>");
                    }
                    aokcVarSingletonList = new java.util.ArrayList(length);
                    for (float f : fArr) {
                        aokcVarSingletonList.add(java.lang.Float.valueOf(f));
                    }
                } else {
                    aokcVarSingletonList = java.util.Collections.singletonList(java.lang.Float.valueOf(fArr[0]));
                    aooh.e(aokcVarSingletonList, "singletonList(...)");
                }
            } else {
                aokcVarSingletonList = aokc.a;
            }
            defpackage.avo.c(a.bi(aokcVarSingletonList, list, "DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ", " | Anchors: "));
        }
        this.a = this.c.length;
    }

    public final float a() {
        float[] fArr = this.c;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int iCD = ajsz.cD(fArr);
        if (iCD > 0) {
            int i = 1;
            while (true) {
                fMax = java.lang.Math.max(fMax, fArr[i]);
                if (i == iCD) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    public final float b() {
        float[] fArr = this.c;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int iCD = ajsz.cD(fArr);
        if (iCD > 0) {
            int i = 1;
            while (true) {
                fMin = java.lang.Math.min(fMin, fArr[i]);
                if (i == iCD) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public final float c(java.lang.Object obj) {
        int iIndexOf = this.b.indexOf(obj);
        aonj aonjVar = defpackage.app.b;
        if (iIndexOf >= 0) {
            float[] fArr = this.c;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        return ((java.lang.Number) aonjVar.a(java.lang.Integer.valueOf(iIndexOf))).floatValue();
    }

    public final java.lang.Object d(int i) {
        return ajsz.bH(this.b, i);
    }

    public final java.lang.Object e(float f) {
        float[] fArr = this.c;
        int length = fArr.length;
        int i = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = java.lang.Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.b.get(i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aqj) {
            defpackage.aqj aqjVar = (defpackage.aqj) obj;
            if (aooh.n(this.b, aqjVar.b) && java.util.Arrays.equals(this.c, aqjVar.c) && this.a == aqjVar.a) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object f(float f, boolean z) {
        float[] fArr = this.c;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = -1;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i2 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i3 = i2;
                f2 = f4;
            }
            i++;
            i2 = i4;
        }
        if (i3 == -1) {
            return null;
        }
        return this.b.get(i3);
    }

    public final boolean g(java.lang.Object obj) {
        return this.b.indexOf(obj) != -1;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + java.util.Arrays.hashCode(this.c)) * 31) + this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.a;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            java.lang.Object objD = d(i);
            float[] fArr = this.c;
            float fFloatValue = (i < 0 || i >= fArr.length) ? ((java.lang.Number) defpackage.app.b.a(java.lang.Integer.valueOf(i))).floatValue() : fArr[i];
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(objD);
            sb2.append('=');
            sb2.append(fFloatValue);
            sb.append(sb2.toString());
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
