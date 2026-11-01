package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarv extends defpackage.aart {
    public final aafe a;

    public aarv(aafe aafeVar) {
        this.a = aafeVar;
    }

    @Override // defpackage.aart
    public final void a(int i, android.os.Bundle bundle) {
        if (i != 0) {
            if (android.util.Log.isLoggable("PeopleClient", 5)) {
                android.util.Log.w("PeopleClient", "Non-success data changed callback received.");
            }
        } else {
            aafe aafeVar = this.a;
            bundle.getString("account");
            bundle.getString("pagegaiaid");
            bundle.getInt("scope");
            aafeVar.b(new defpackage.aaly(4));
        }
    }
}
