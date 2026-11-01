package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o extends j$.time.format.i {
    public static final j$.time.LocalDate h = j$.time.LocalDate.of(2000, 1, 1);
    public final j$.time.LocalDate g;

    public o(j$.time.temporal.l lVar, int i, int i2, j$.time.LocalDate localDate, int i3) {
        super(lVar, i, i2, j$.time.format.d0.NOT_NEGATIVE, i3);
        this.g = localDate;
    }

    @Override // j$.time.format.i
    public final long a(j$.time.format.w wVar, long j) {
        long jAbs = java.lang.Math.abs(j);
        j$.time.LocalDate localDate = this.g;
        long jH = localDate != null ? j$.com.android.tools.r8.a.y(wVar.a).l(localDate).h(this.a) : 0;
        long[] jArr = j$.time.format.i.f;
        if (j >= jH) {
            long j2 = jArr[this.b];
            if (j < jH + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final boolean b(j$.time.format.v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(final j$.time.format.v vVar, long j, final int i, final int i2) {
        final j$.time.format.o oVar;
        j$.time.format.v vVar2;
        final long j2;
        int iH;
        long j3;
        j$.time.LocalDate localDate = this.g;
        if (localDate != null) {
            j$.time.chrono.a aVar = vVar.c().c;
            if (aVar == null && (aVar = vVar.a.e) == null) {
                aVar = j$.time.chrono.q.c;
            }
            iH = aVar.l(localDate).h(this.a);
            oVar = this;
            j2 = j;
            java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void r(java.lang.Object obj) {
                    this.a.c(vVar, j2, i, i2);
                }

                public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer2);
                }
            };
            vVar2 = vVar;
            java.util.ArrayList arrayList = vVar2.e;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                vVar2.e = arrayList;
            }
            arrayList.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            iH = 0;
        }
        int i3 = i2 - i;
        int i4 = oVar.b;
        if (i3 != i4 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = j$.time.format.i.f[i4];
            long j5 = iH;
            long j6 = j5 - (j5 % j4);
            long j7 = iH > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.f(oVar.a, j3, i, i2);
    }

    @Override // j$.time.format.i
    public final j$.time.format.i d() {
        if (this.e == -1) {
            return this;
        }
        return new j$.time.format.o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final j$.time.format.i e(int i) {
        return new j$.time.format.o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.Object objRequireNonNull = this.g;
        if (objRequireNonNull == null) {
            objRequireNonNull = j$.util.Objects.requireNonNull(0, "defaultObj");
        }
        return "ReducedValue(" + strValueOf + "," + this.b + "," + this.c + "," + java.lang.String.valueOf(objRequireNonNull) + ")";
    }
}
