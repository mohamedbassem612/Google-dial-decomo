package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class god {
    public final defpackage.gne a;
    final /* synthetic */ defpackage.goe b;

    public god(defpackage.goe goeVar, defpackage.gne gneVar) {
        this.b = goeVar;
        this.a = gneVar;
    }

    public static final gnn a(androidx.window.extensions.embedding.ActivityStack activityStack) {
        defpackage.aooh.f(activityStack, "activityStack");
        java.util.List listM = ddz$.ExternalSyntheticApiModelOutline0.m(activityStack);
        defpackage.aooh.e(listM, "getActivities(...)");
        boolean zM = ddz$.ExternalSyntheticApiModelOutline0.m(activityStack);
        defpackage.aooh.f(listM, "activitiesInProcess");
        return new gnn(listM, zM, (androidx.window.extensions.embedding.ActivityStack.Token) null);
    }
}
