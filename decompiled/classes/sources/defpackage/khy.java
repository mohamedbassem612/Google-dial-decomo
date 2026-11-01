package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class khy extends defpackage.gfj {
    public khy(defpackage.kib kibVar) {
        j$.util.Objects.requireNonNull(kibVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `PeopleDirectoryContactEntity` (`uuid`,`name`,`photoThumbnailUri`,`packageName`,`lookupKey`,`capabilities`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.kid kidVar = (defpackage.kid) obj;
        ginVar.j(1, kidVar.a);
        ginVar.j(2, kidVar.b);
        ginVar.j(3, kidVar.c);
        ginVar.j(4, kidVar.d);
        ginVar.j(5, kidVar.e);
        ginVar.h(6, kidVar.f);
    }
}
