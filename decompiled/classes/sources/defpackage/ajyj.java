package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajyj implements defpackage.ajyn {
    private final java.lang.String a;
    private final defpackage.ajyk b;

    public ajyj(java.util.Set set, defpackage.ajyk ajykVar) {
        this.a = b(set);
        this.b = ajykVar;
    }

    private static java.lang.String b(java.util.Set set) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.ajyl ajylVar = (defpackage.ajyl) it.next();
            sb.append(ajylVar.a);
            sb.append('/');
            sb.append(ajylVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.ajyn
    public final java.lang.String a() {
        defpackage.ajyk ajykVar = this.b;
        boolean zIsEmpty = ajykVar.a().isEmpty();
        java.lang.String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(ajykVar.a());
    }
}
