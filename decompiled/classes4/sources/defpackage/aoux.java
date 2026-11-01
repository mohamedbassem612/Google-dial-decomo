package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoux {
    public java.lang.Object a;
    public java.lang.Object b;
    public int c;
    public java.lang.Object d;
    public java.lang.Object e;

    public aoux(defpackage.adxd adxdVar) {
        this.b = adxdVar.a;
        this.a = adxdVar.b;
        this.d = adxdVar.c;
        this.e = adxdVar.d;
        this.c = adxdVar.e;
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.c;
        this.c = i + 1;
        if (i == 0) {
            this.a = obj;
            this.b = obj2;
            return;
        }
        int i2 = i - 1;
        java.lang.Object objCopyOf = this.e;
        int i3 = i2 << 1;
        if (objCopyOf == null) {
            objCopyOf = new java.lang.Object[8];
            this.e = objCopyOf;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) objCopyOf;
            if (i3 == objArr.length) {
                objCopyOf = java.util.Arrays.copyOf(objArr, i2 << 2);
                aooh.e(objCopyOf, "copyOf(...)");
                this.e = objCopyOf;
            }
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objCopyOf;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.adxd b() {
        ?? r4;
        int i;
        java.lang.Object obj = this.b;
        if (obj != null && (r4 = this.d) != 0 && (i = this.c) != 0) {
            return new defpackage.adxd((java.net.URL) obj, (java.lang.String) this.a, r4, (byte[]) this.e, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" url");
        }
        if (this.d == null) {
            sb.append(" headers");
        }
        if (this.c == 0) {
            sb.append(" purpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map c() {
        ?? r1 = this.d;
        if (r1 != 0) {
            return r1;
        }
        throw new java.lang.IllegalStateException("Property \"headers\" has not been set");
    }

    public final void d(adxc adxcVar, java.lang.String str) {
        java.util.List arrayList = c().containsKey(adxcVar) ? (java.util.List) c().get(adxcVar) : new java.util.ArrayList(1);
        arrayList.add(str);
        c().put(adxcVar, arrayList);
    }

    public aoux() {
    }
}
