package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahcz {
    public defpackage.ahcd a;
    public final boolean b;
    public defpackage.aigf c;

    public ahcz(java.util.Map map, defpackage.ahcd ahcdVar, boolean z) {
        if (map == null) {
            defpackage.aooh.i("map");
        }
        if (ahcdVar == null) {
            defpackage.aooh.i("metadata");
        }
        this.a = ahcdVar;
        this.b = z;
        if (map == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aigf aigfVarI = defpackage.aigf.i(map);
        defpackage.aooh.e(aigfVarI, "copyOf(...)");
        this.c = aigfVarI;
    }
}
