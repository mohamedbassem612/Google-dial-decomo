package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wp {
    public boolean a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    public final defpackage.adxe a() {
        if (this.a) {
            this.f = this.e;
        } else {
            try {
                java.util.Map mapB = b();
                java.lang.Object objB = this.e;
                adxc adxcVar = adxc.a;
                if (mapB.containsKey(adxcVar)) {
                    java.util.List list = (java.util.List) mapB.get(adxcVar);
                    if (!list.isEmpty() && ahvr.r((java.lang.CharSequence) list.get(0), "gzip")) {
                        objB = aisk.b(new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream((byte[]) objB)));
                    }
                }
                this.f = objB;
            } catch (java.io.IOException e) {
                this.d = e;
            }
        }
        ?? r2 = this.b;
        if (r2 == 0) {
            throw new java.lang.IllegalStateException("Missing required properties: headers");
        }
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.e;
        return new defpackage.adxe((java.lang.Integer) obj, r2, (byte[]) obj2, (byte[]) this.f, (java.lang.Exception) this.d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map b() {
        ?? r1 = this.b;
        if (r1 != 0) {
            return r1;
        }
        throw new java.lang.IllegalStateException("Property \"headers\" has not been set");
    }
}
