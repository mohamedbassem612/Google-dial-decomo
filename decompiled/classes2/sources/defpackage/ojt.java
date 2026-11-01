package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojt extends aomh implements aonn {
    int a;
    final /* synthetic */ oju b;
    final /* synthetic */ android.media.AudioFocusRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojt(oju ojuVar, android.media.AudioFocusRequest audioFocusRequest, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ojuVar;
        this.c = audioFocusRequest;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        oju ojuVar = this.b;
        android.media.AudioFocusRequest audioFocusRequest = this.c;
        this.a = 1;
        java.lang.Object objAj = aoov.aj(ojuVar.c, new defpackage.ojs(ojuVar, audioFocusRequest, null), this);
        return objAj == aoluVar ? aoluVar : objAj;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ojt(this.b, this.c, aolnVar);
    }
}
