package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class gmb extends defpackage.fsu {
    protected defpackage.dwo[] m;
    java.lang.String n;
    int o;
    int p;

    public gmb(defpackage.gmb gmbVar) {
        super((short[]) null);
        this.m = null;
        this.o = 0;
        this.n = gmbVar.n;
        int i = gmbVar.p;
        this.p = 0;
        this.m = dvf.e(gmbVar.m);
    }

    public boolean N() {
        return false;
    }

    public defpackage.dwo[] getPathData() {
        return this.m;
    }

    public java.lang.String getPathName() {
        return this.n;
    }

    public void setPathData(defpackage.dwo[] dwoVarArr) {
        defpackage.dwo[] dwoVarArr2 = this.m;
        if (dwoVarArr2 != null && dwoVarArr != null) {
            if (dwoVarArr2.length == dwoVarArr.length) {
                for (int i = 0; i < dwoVarArr2.length; i++) {
                    defpackage.dwo dwoVar = dwoVarArr2[i];
                    char c = dwoVar.a;
                    defpackage.dwo dwoVar2 = dwoVarArr[i];
                    if (c == dwoVar2.a && dwoVar.b.length == dwoVar2.b.length) {
                    }
                }
                defpackage.dwo[] dwoVarArr3 = this.m;
                for (int i2 = 0; i2 < dwoVarArr.length; i2++) {
                    dwoVarArr3[i2].a = dwoVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = dwoVarArr[i2].b;
                        if (i3 < fArr.length) {
                            dwoVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = dvf.e(dwoVarArr);
    }

    public gmb() {
        super((short[]) null);
        this.m = null;
        this.o = 0;
    }
}
