package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogt implements java.io.Closeable {
    public final appa a;
    public final defpackage.aogo b;
    private final defpackage.aogr c;

    public aogt(appa appaVar) {
        this.a = appaVar;
        defpackage.aogr aogrVar = new defpackage.aogr(appaVar);
        this.c = aogrVar;
        this.b = new defpackage.aogo(aogrVar);
    }

    public final java.util.List a(int i, short s, byte b, int i2) throws java.io.IOException {
        defpackage.aogr aogrVar = this.c;
        aogrVar.d = i;
        aogrVar.a = i;
        aogrVar.e = s;
        aogrVar.b = b;
        aogrVar.c = i2;
        while (true) {
            defpackage.aogo aogoVar = this.b;
            appa appaVar = aogoVar.b;
            if (appaVar.B()) {
                java.util.List list = aogoVar.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                list.clear();
                return arrayList;
            }
            byte bD = appaVar.d();
            int i3 = bD & 255;
            if (i3 == 128) {
                throw new java.io.IOException("index == 0");
            }
            if ((bD & 128) == 128) {
                int iB = aogoVar.b(i3, 127);
                int i4 = iB - 1;
                if (!defpackage.aogo.g(i4)) {
                    int length = defpackage.aogq.b.length;
                    int iA = aogoVar.a(iB - 62);
                    if (iA >= 0) {
                        defpackage.aogn[] aognVarArr = aogoVar.e;
                        if (iA <= aognVarArr.length - 1) {
                            aogoVar.a.add(aognVarArr[iA]);
                        }
                    }
                    throw new java.io.IOException("Header index too large " + iB);
                }
                aogoVar.a.add(defpackage.aogq.b[i4]);
            } else if (i3 == 64) {
                appb appbVarD = aogoVar.d();
                defpackage.aogq.a(appbVarD);
                aogoVar.f(new defpackage.aogn(appbVarD, aogoVar.d()));
            } else if ((bD & 64) == 64) {
                aogoVar.f(new defpackage.aogn(aogoVar.c(aogoVar.b(i3, 63) - 1), aogoVar.d()));
            } else if ((bD & 32) == 32) {
                int iB2 = aogoVar.b(i3, 31);
                aogoVar.d = iB2;
                if (iB2 < 0 || iB2 > aogoVar.c) {
                    throw new java.io.IOException(a.bj(iB2, "Invalid dynamic table size update "));
                }
                aogoVar.e();
            } else if (i3 == 16 || i3 == 0) {
                appb appbVarD2 = aogoVar.d();
                defpackage.aogq.a(appbVarD2);
                aogoVar.a.add(new defpackage.aogn(appbVarD2, aogoVar.d()));
            } else {
                aogoVar.a.add(new defpackage.aogn(aogoVar.c(aogoVar.b(i3, 15) - 1), aogoVar.d()));
            }
        }
    }

    public final void b() {
        appa appaVar = this.a;
        appaVar.f();
        appaVar.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
