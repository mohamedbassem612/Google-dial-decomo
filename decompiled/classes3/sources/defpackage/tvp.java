package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tvp {
    private static final defpackage.tvs a;
    private static final aec b;

    static {
        if (defpackage.tvq.a == null) {
            defpackage.tvq.a = new defpackage.tvq();
        }
        a = defpackage.tvq.a;
        aec aecVar = new aec(0);
        b = aecVar;
        if (defpackage.tvo.a == null) {
            defpackage.tvo.a = new defpackage.tvo();
        }
        aecVar.put("bul", defpackage.tvo.a);
        if (defpackage.tvr.a == null) {
            defpackage.tvr.a = new defpackage.tvr();
        }
        aecVar.put("rus", defpackage.tvr.a);
        if (defpackage.tvt.a == null) {
            defpackage.tvt.a = new defpackage.tvt();
        }
        aecVar.put("ukr", defpackage.tvt.a);
    }

    public static char a(android.content.Context context, char c) {
        j$.util.Optional optionalC = a.c(c);
        if (optionalC.isPresent()) {
            return ((java.lang.Character) optionalC.orElseThrow()).charValue();
        }
        j$.util.Optional optionalC2 = c(context);
        if (optionalC2.isPresent()) {
            optionalC = ((defpackage.tvs) optionalC2.orElseThrow()).c(c);
        }
        return optionalC.isPresent() ? ((java.lang.Character) optionalC.orElseThrow()).charValue() : c;
    }

    public static char b(android.content.Context context, char c) {
        j$.util.Optional optionalB = a.b(c);
        if (optionalB.isPresent()) {
            return ((java.lang.Character) optionalB.orElseThrow()).charValue();
        }
        j$.util.Optional optionalC = c(context);
        if (optionalC.isPresent()) {
            optionalB = ((defpackage.tvs) optionalC.orElseThrow()).b(c);
        }
        return optionalB.isPresent() ? ((java.lang.Character) optionalB.orElseThrow()).charValue() : c;
    }

    static j$.util.Optional c(android.content.Context context) {
        java.lang.String iSO3Language = gus.ae(context).getISO3Language();
        aec aecVar = b;
        return aecVar.containsKey(iSO3Language) ? j$.util.Optional.of((defpackage.tvs) aecVar.get(iSO3Language)) : j$.util.Optional.empty();
    }

    public static boolean d(android.content.Context context, char c) {
        if (a.d(c)) {
            return true;
        }
        j$.util.Optional optionalC = c(context);
        return optionalC.isPresent() && ((defpackage.tvs) optionalC.orElseThrow()).d(c);
    }

    public static boolean e(android.content.Context context, char c) {
        if (a.e(c)) {
            return true;
        }
        j$.util.Optional optionalC = c(context);
        return optionalC.isPresent() && ((defpackage.tvs) optionalC.orElseThrow()).e(c);
    }

    public static boolean f(android.content.Context context, char c) {
        if (defpackage.tvs.f(c)) {
            return true;
        }
        j$.util.Optional optionalC = c(context);
        if (optionalC.isPresent()) {
            if (defpackage.tvs.f(c)) {
                return true;
            }
        }
        return false;
    }
}
