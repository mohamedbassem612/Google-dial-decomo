package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apjh {
    public final defpackage.apiw a;
    public final java.lang.String b;
    public final defpackage.apiu c;
    public final defpackage.apjk d;
    public defpackage.apie e;
    public final defpackage.aooh f;

    public apjh(defpackage.apjg apjgVar) {
        java.lang.Object obj = apjgVar.a;
        if (obj == null) {
            throw new java.lang.IllegalStateException("url == null");
        }
        this.a = (defpackage.apiw) obj;
        this.b = (java.lang.String) apjgVar.b;
        this.c = defpackage.aoov.bl((defpackage.zzx) apjgVar.c);
        this.d = (defpackage.apjk) apjgVar.d;
        this.f = (defpackage.aooh) apjgVar.e;
    }

    public final java.lang.String a(java.lang.String str) {
        return this.c.b(str);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        defpackage.apiu apiuVar = this.c;
        if (apiuVar.a() != 0) {
            sb.append(", headers=[");
            java.util.Iterator itBg = defpackage.aoov.bg(apiuVar);
            int i = 0;
            while (itBg.hasNext()) {
                java.lang.Object next = itBg.next();
                int i2 = i + 1;
                if (i < 0) {
                    defpackage.ajsz.bh();
                }
                defpackage.aoiu aoiuVar = (defpackage.aoiu) next;
                java.lang.String str = (java.lang.String) aoiuVar.a;
                java.lang.String str2 = (java.lang.String) aoiuVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (true == defpackage.apjv.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        defpackage.aooh aoohVar = this.f;
        if (!defpackage.aooh.n(aoohVar, defpackage.apjs.a)) {
            sb.append(", tags=");
            sb.append(aoohVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
