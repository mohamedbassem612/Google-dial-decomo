package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxh implements defpackage.tem {
    public static final aimz a = aimz.i("com/android/dialer/contactsearch/SuggestedContactsSearchDataSource");
    public final thu b;
    public final tek c = tek.d;

    public lxh(thu thuVar) {
        this.b = thuVar;
    }

    @Override // defpackage.tem
    public final tek a() {
        return this.c;
    }

    @Override // defpackage.tem
    public final aoxh c(tei teiVar) {
        aooh.f(teiVar, "query");
        return new aowy(new defpackage.lwe(teiVar, this, (aoln) null, 3));
    }
}
