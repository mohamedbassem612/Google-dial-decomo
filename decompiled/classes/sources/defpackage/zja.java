package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zja {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/datastore/DialerDataStoreConfig");

    public static final defpackage.ahkl a(java.lang.String str, defpackage.albh albhVar) {
        if (albhVar == null) {
            defpackage.aooh.i("defaultInstance");
        }
        defpackage.ahkl ahklVarA = defpackage.ahkm.a();
        ahklVarA.a = str;
        ahklVarA.c(albhVar);
        ahklVarA.c = j$.util.Optional.of(new defpackage.efk(new defpackage.nxi(str, albhVar, 5, null)));
        return ahklVarA;
    }

    public static /* synthetic */ defpackage.ahkm b(java.lang.String str, defpackage.albh albhVar, java.lang.Iterable iterable, defpackage.aonj aonjVar, int i) {
        if ((i & 4) != 0) {
            iterable = defpackage.aoke.a;
        }
        if ((i & 8) != 0) {
            aonjVar = new defpackage.rou(6);
        }
        if (albhVar == null) {
            defpackage.aooh.i("defaultInstance");
        }
        if (iterable == null) {
            defpackage.aooh.i("migrations");
        }
        if (aonjVar == null) {
            defpackage.aooh.i("builderAction");
        }
        defpackage.ahkl ahklVarA = a(str, albhVar);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ahklVarA.b((defpackage.ecs) it.next());
        }
        aonjVar.a(ahklVarA);
        return ahklVarA.a();
    }
}
