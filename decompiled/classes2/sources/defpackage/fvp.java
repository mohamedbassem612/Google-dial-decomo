package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.fwm(a = "activity")
public class fvp extends defpackage.fwn {
    private final android.content.Context c;
    private final android.app.Activity d;

    public fvp(android.content.Context context) {
        java.lang.Object next;
        if (context == null) {
            aooh.i("context");
        }
        this.c = context;
        java.util.Iterator itA = aooc.h(context, new defpackage.dkq(19)).a();
        while (itA.hasNext()) {
            next = itA.next();
            if (((android.content.Context) next) instanceof android.app.Activity) {
                this.d = (android.app.Activity) next;
            }
        }
        next = null;
        this.d = (android.app.Activity) next;
    }

    @Override // defpackage.fwn
    public final /* synthetic */ defpackage.fwc a() {
        return new defpackage.fvo(this);
    }

    @Override // defpackage.fwn
    public final boolean b() {
        android.app.Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.fwn
    public final /* synthetic */ defpackage.fwc c(defpackage.fwc fwcVar) {
        throw new java.lang.IllegalStateException("Destination " + ((defpackage.fvo) fwcVar).b() + " does not have an Intent set.");
    }
}
