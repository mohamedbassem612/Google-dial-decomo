package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajxj implements defpackage.aaul {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ajxj(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, java.lang.String str, int i) {
        this.$cid = i;
        this.b = firebaseInstanceId;
        this.c = str;
        this.a = "*";
    }

    @Override // defpackage.aaul
    public final aaum a(java.lang.Object obj) {
        java.lang.Object obj2;
        int i = this.$cid;
        java.lang.Object obj3 = this.b;
        if (i != 0) {
            com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = (com.google.firebase.iid.FirebaseInstanceId) obj3;
            java.lang.String str = (java.lang.String) obj;
            com.google.firebase.iid.FirebaseInstanceId.f.l(firebaseInstanceId.c(), (java.lang.String) this.c, str, firebaseInstanceId.c.b());
            return aazc.s(new ajyk(str, (byte[]) null));
        }
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = (com.google.firebase.messaging.FirebaseMessaging) obj3;
        java.lang.String str2 = (java.lang.String) obj;
        com.google.firebase.messaging.FirebaseMessaging.n(firebaseMessaging.d).d(firebaseMessaging.b(), this.a, str2, firebaseMessaging.g.c());
        if (firebaseMessaging.h.v() || (obj2 = this.c) == null || !str2.equals(((ajxs) obj2).b)) {
            firebaseMessaging.m(str2);
        }
        return aazc.s(str2);
    }

    public /* synthetic */ ajxj(com.google.firebase.messaging.FirebaseMessaging firebaseMessaging, java.lang.String str, ajxs ajxsVar, int i) {
        this.$cid = i;
        this.b = firebaseMessaging;
        this.a = str;
        this.c = ajxsVar;
    }
}
