package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajvz implements aaui {
    public final /* synthetic */ com.google.firebase.iid.FirebaseInstanceId a;
    public final /* synthetic */ ajwc b;

    public /* synthetic */ ajvz(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, ajwc ajwcVar) {
        this.a = firebaseInstanceId;
        this.b = ajwcVar;
    }

    public final void d(java.lang.Object obj) {
        java.lang.Object obj2 = ((ajyk) obj).b;
        ajwc ajwcVar = this.b;
        if (ajwcVar != null) {
            if (((java.lang.String) obj2).equals(ajwcVar.b)) {
                return;
            }
        }
        java.util.Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.messaging.FirebaseMessaging) ((apnt) it.next()).a).m((java.lang.String) obj2);
        }
    }
}
