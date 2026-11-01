package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwt extends defpackage.gfj {
    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.gwr gwrVar = (defpackage.gwr) obj;
        ginVar.j(1, gwrVar.a);
        ginVar.h(2, gwrVar.b.longValue());
    }
}
