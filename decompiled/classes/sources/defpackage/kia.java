package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class kia extends defpackage.gfi {
    public kia(defpackage.kib kibVar) {
        j$.util.Objects.requireNonNull(kibVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `PeopleDirectoryContactEntity` SET `uuid` = ?,`name` = ?,`photoThumbnailUri` = ?,`packageName` = ?,`lookupKey` = ?,`capabilities` = ? WHERE `uuid` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.kid kidVar = (defpackage.kid) obj;
        java.lang.String str = kidVar.a;
        ginVar.j(1, str);
        ginVar.j(2, kidVar.b);
        ginVar.j(3, kidVar.c);
        ginVar.j(4, kidVar.d);
        ginVar.j(5, kidVar.e);
        ginVar.h(6, kidVar.f);
        ginVar.j(7, str);
    }
}
