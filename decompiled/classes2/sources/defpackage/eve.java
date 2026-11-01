package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eve {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final byte l;
    public final byte m;

    /* JADX WARN: Code duplicated, block: B:68:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    public eve(amwp amwpVar) {
        boolean zP;
        boolean zP2;
        byte bD;
        byte bD2;
        byte bD3;
        boolean zP3;
        boolean zP4 = false;
        ahvr.bM(amwpVar.a == 1);
        byte[] bArr = new byte[((java.nio.ByteBuffer) amwpVar.b).remaining()];
        ((java.nio.ByteBuffer) amwpVar.b).asReadOnlyBuffer().get(bArr);
        defpackage.etv etvVar = new defpackage.etv(bArr);
        this.g = etvVar.d(3);
        etvVar.m();
        boolean zP5 = etvVar.p();
        this.a = zP5;
        if (zP5) {
            etvVar.d(5);
            this.b = false;
            this.h = false;
        } else {
            if (etvVar.p()) {
                etvVar.n(64);
                if (etvVar.p()) {
                    int i = 0;
                    while (!etvVar.p()) {
                        i++;
                    }
                    if (i < 32) {
                        etvVar.n(i);
                    }
                }
                boolean zP6 = etvVar.p();
                this.b = zP6;
                if (zP6) {
                    etvVar.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = etvVar.p();
            int iD = etvVar.d(5);
            for (int i2 = 0; i2 <= iD; i2++) {
                etvVar.n(12);
                if (i2 == 0) {
                    if (etvVar.d(5) > 7) {
                        etvVar.p();
                    }
                } else if (etvVar.d(5) > 7) {
                    etvVar.m();
                }
                if (this.b) {
                    etvVar.m();
                }
                if (this.h && etvVar.p()) {
                    if (i2 == 0) {
                        etvVar.d(4);
                    } else {
                        etvVar.n(4);
                    }
                }
            }
        }
        int iD2 = etvVar.d(4);
        int iD3 = etvVar.d(4);
        etvVar.n(iD2 + 1);
        etvVar.n(iD3 + 1);
        if (this.a) {
            this.c = false;
        } else {
            boolean zP7 = etvVar.p();
            this.c = zP7;
            if (zP7) {
                etvVar.n(4);
                etvVar.n(3);
            }
        }
        etvVar.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            etvVar.n(4);
            boolean zP8 = etvVar.p();
            if (zP8) {
                etvVar.n(2);
            }
            if (etvVar.p()) {
                this.d = true;
            } else {
                boolean zP9 = etvVar.p();
                this.d = zP9;
                if (!zP9) {
                    this.e = true;
                }
                if (zP8) {
                    this.f = etvVar.d(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            if (etvVar.p()) {
                this.e = true;
            } else {
                this.e = etvVar.p();
            }
            if (zP8) {
                this.f = etvVar.d(3) + 1;
            } else {
                this.f = 0;
            }
        }
        etvVar.n(3);
        boolean zP10 = etvVar.p();
        if (this.g == 2 && zP10) {
            zP = etvVar.p();
            this.i = zP;
        } else {
            this.i = false;
            zP = false;
        }
        if (this.g != 1) {
            zP2 = etvVar.p();
            this.j = zP2;
        } else {
            this.j = false;
            zP2 = false;
        }
        if (etvVar.p()) {
            bD2 = (byte) etvVar.d(8);
            this.l = bD2;
            bD3 = (byte) etvVar.d(8);
            this.m = bD3;
            bD = (byte) etvVar.d(8);
        } else {
            this.l = (byte) 0;
            this.m = (byte) 0;
            bD = 0;
            bD2 = 0;
            bD3 = 0;
        }
        if (zP2) {
            etvVar.m();
            this.k = false;
        } else if (bD2 == 1 && bD3 == 13 && bD == 0) {
            this.k = false;
        } else {
            etvVar.m();
            int i3 = this.g;
            if (i3 == 0) {
                this.k = true;
                zP3 = true;
                zP4 = true;
            } else if (i3 == 1) {
                this.k = false;
                zP3 = false;
            } else if (zP) {
                zP3 = etvVar.p();
                this.k = zP3;
                if (zP3) {
                    zP4 = etvVar.p();
                }
            } else {
                this.k = true;
                zP3 = true;
            }
            if (zP3 && zP4) {
                etvVar.d(2);
            }
        }
        etvVar.m();
    }
}
