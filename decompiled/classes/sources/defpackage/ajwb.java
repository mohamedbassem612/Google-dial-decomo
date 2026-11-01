package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwb implements defpackage.ajwd {
    final com.google.firebase.iid.FirebaseInstanceId a;

    public ajwb(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.ajwd
    public final void a(defpackage.apnt apntVar) {
        this.a.d.add(apntVar);
    }
}
