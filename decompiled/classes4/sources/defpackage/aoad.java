package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoad {
    public defpackage.aodu b;
    public int c;
    public final defpackage.aodv g;
    public final defpackage.aodj h;
    public boolean i;
    public int j;
    public long l;
    private final defpackage.aoac m;
    public int a = -1;
    public anmj d = anmh.a;
    public final defpackage.aoab e = new defpackage.aoab(this);
    public final java.nio.ByteBuffer f = java.nio.ByteBuffer.allocate(5);
    public int k = -1;

    public aoad(defpackage.aoac aoacVar, defpackage.aodv aodvVar, defpackage.aodj aodjVar) {
        this.m = aoacVar;
        this.g = aodvVar;
        this.h = aodjVar;
    }

    public final void a(boolean z, boolean z2) {
        defpackage.aodu aoduVar = this.b;
        this.b = null;
        this.m.u(aoduVar, z, z2, this.j);
        this.j = 0;
    }

    public final void b(defpackage.aoaa aoaaVar, boolean z) {
        java.util.List list = aoaaVar.a;
        java.util.Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((defpackage.aodu) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new defpackage.anqz(anqw.h.f(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(this.a))), null);
        }
        java.nio.ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        defpackage.aodu aoduVarA = this.g.a(5);
        aoduVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = aoduVarA;
            return;
        }
        defpackage.aoac aoacVar = this.m;
        aoacVar.u(aoduVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            aoacVar.u((defpackage.aodu) list.get(i2), false, false, 0);
        }
        this.b = (defpackage.aodu) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            defpackage.aodu aoduVar = this.b;
            if (aoduVar != null && aoduVar.b() == 0) {
                a(false, false);
            }
            if (this.b == null) {
                ahvr.bZ(this.c > 0, "knownLengthPendingAllocation reached 0");
                defpackage.aodu aoduVarA = this.g.a(this.c);
                this.b = aoduVarA;
                int i3 = this.c;
                this.c = i3 - java.lang.Math.min(i3, aoduVarA.b());
            }
            int iMin = java.lang.Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
