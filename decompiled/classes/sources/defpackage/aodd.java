package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aodd {
    public final java.lang.Object a;
    public int b;
    public java.lang.Object c;

    public aodd() {
        this.a = new defpackage.cfc(new defpackage.apnb[16]);
    }

    public final void a(int i, java.lang.Object obj) {
        if (i < 0) {
            avo.c("size should be >=0");
        }
        if (i != 0) {
            defpackage.apnb apnbVar = new defpackage.apnb(this.b, i, obj);
            this.b += i;
            ((defpackage.cfc) this.a).n(apnbVar);
        }
    }

    public final defpackage.apnb b(int i) {
        if (i < 0 || i >= this.b) {
            avo.e("Index " + i + ", size " + this.b);
        }
        java.lang.Object obj = this.c;
        if (obj != null) {
            defpackage.apnb apnbVar = (defpackage.apnb) obj;
            int i2 = apnbVar.b;
            if (i < apnbVar.a + i2 && i2 <= i) {
                return apnbVar;
            }
        }
        defpackage.cfc cfcVar = (defpackage.cfc) this.a;
        defpackage.apnb apnbVar2 = (defpackage.apnb) cfcVar.a[defpackage.den.aH(cfcVar, i)];
        this.c = apnbVar2;
        return apnbVar2;
    }

    public aodd(defpackage.cdk cdkVar, int i, java.lang.Object obj) {
        this.a = cdkVar;
        this.b = i;
        this.c = obj;
    }

    public aodd(java.lang.Object obj) {
        this.a = obj;
    }
}
