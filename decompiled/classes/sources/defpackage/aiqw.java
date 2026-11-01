package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiqw extends defpackage.aiqv {
    public static final java.util.Map c;
    private final defpackage.aioi d;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.aioi.class);
        for (defpackage.aioi aioiVar : defpackage.aioi.values()) {
            defpackage.aiqw[] aiqwVarArr = new defpackage.aiqw[10];
            for (int i = 0; i < 10; i++) {
                aiqwVarArr[i] = new defpackage.aiqw(i, aioiVar, defpackage.aioj.a);
            }
            enumMap.put(aioiVar, aiqwVarArr);
        }
        c = j$.util.DesugarCollections.unmodifiableMap(enumMap);
    }

    public aiqw(int i, defpackage.aioi aioiVar, defpackage.aioj aiojVar) {
        super(aiojVar, i);
        defpackage.aiql.l(aioiVar, "format char");
        this.d = aioiVar;
        if (aiojVar.c()) {
            java.lang.String str = aioiVar.o;
            return;
        }
        int i2 = aioiVar.l;
        i2 = aiojVar.d() ? i2 & 65503 : i2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
        aiojVar.f(sb);
        sb.append((char) i2);
    }

    @Override // defpackage.aiqv
    public final void a(defpackage.aiqz aiqzVar, java.lang.Object obj) {
        aiqzVar.d(obj, this.d, this.b);
    }
}
