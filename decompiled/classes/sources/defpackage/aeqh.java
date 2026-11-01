package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqh {
    private static final defpackage.ahzf b = defpackage.ahzf.b('/');
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^(\\*[a-z]+\\*).*");
    final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    static java.lang.String a(java.lang.String str) {
        java.util.List listJ = b.j(str);
        return listJ.size() != 3 ? "MALFORMED" : (java.lang.String) listJ.get(0);
    }

    public final defpackage.apeq b(defpackage.apeq apeqVar) {
        defpackage.apel apelVar = apeqVar.e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        if ((apelVar.b & 1) == 0) {
            return apeqVar;
        }
        defpackage.apel apelVar2 = apeqVar.e;
        if (apelVar2 == null) {
            apelVar2 = defpackage.apel.a;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        defpackage.akzx akzxVarL = apelVar2.L();
        java.lang.Long l = (java.lang.Long) concurrentHashMap.get(java.lang.Long.valueOf(((defpackage.apel) akzxVarL.b).c));
        defpackage.ahvr.ci(l);
        defpackage.akzx akzxVarL2 = apeqVar.L();
        long jLongValue = l.longValue();
        akzxVarL.u();
        defpackage.apel apelVar3 = (defpackage.apel) akzxVarL.b;
        apelVar3.b |= 1;
        apelVar3.c = jLongValue;
        akzxVarL2.u();
        defpackage.apeq apeqVar2 = (defpackage.apeq) akzxVarL2.b;
        defpackage.apel apelVar4 = (defpackage.apel) akzxVarL.r();
        j$.util.Objects.requireNonNull(apelVar4);
        apeqVar2.e = apelVar4;
        apeqVar2.b |= 4;
        return (defpackage.apeq) akzxVarL2.r();
    }

    final defpackage.apeq c(int i, defpackage.apeq apeqVar) {
        defpackage.apel apelVar = apeqVar.e;
        if (apelVar == null) {
            apelVar = defpackage.apel.a;
        }
        if ((apelVar.b & 2) == 0) {
            return apeqVar;
        }
        defpackage.apel apelVar2 = apeqVar.e;
        if (apelVar2 == null) {
            apelVar2 = defpackage.apel.a;
        }
        defpackage.akzx akzxVarL = apelVar2.L();
        defpackage.akzx akzxVarL2 = apeqVar.L();
        java.lang.String strConcat = ((defpackage.apel) akzxVarL.b).d;
        java.lang.Long lAg = agmc.ag(strConcat);
        defpackage.ahvr.ci(lAg);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        long jLongValue = lAg.longValue();
        if (!concurrentHashMap.containsKey(lAg)) {
            int i2 = i - 1;
            if (i2 == 0) {
                java.util.regex.Matcher matcher = c.matcher(strConcat);
                if (matcher.matches()) {
                    strConcat = strConcat.startsWith("*sync*/") ? "*sync*/".concat(java.lang.String.valueOf(a(strConcat.substring(7)))) : matcher.group(1);
                }
            } else if (i2 == 1) {
                strConcat = a(strConcat);
            } else if (i2 == 2) {
                strConcat = "--";
            }
            java.lang.Long lAg2 = agmc.ag(strConcat);
            if (lAg2 != null) {
                concurrentHashMap.putIfAbsent(lAg, lAg2);
            }
        }
        akzxVarL.u();
        defpackage.apel apelVar3 = (defpackage.apel) akzxVarL.b;
        apelVar3.b |= 1;
        apelVar3.c = jLongValue;
        akzxVarL.u();
        defpackage.apel apelVar4 = (defpackage.apel) akzxVarL.b;
        apelVar4.b &= -3;
        apelVar4.d = defpackage.apel.a.d;
        akzxVarL2.u();
        defpackage.apeq apeqVar2 = (defpackage.apeq) akzxVarL2.b;
        defpackage.apel apelVar5 = (defpackage.apel) akzxVarL.r();
        j$.util.Objects.requireNonNull(apelVar5);
        apeqVar2.e = apelVar5;
        apeqVar2.b |= 4;
        return (defpackage.apeq) akzxVarL2.r();
    }
}
