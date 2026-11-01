package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aafa extends android.app.Fragment implements defpackage.aaez {
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap();
    private final defpackage.aafb b = new defpackage.aafb();

    @Override // defpackage.aaez
    public final android.app.Activity a() {
        return getActivity();
    }

    @Override // defpackage.aaez
    public final void b(defpackage.aaey aaeyVar) {
        this.b.h(aaeyVar);
    }

    @Override // defpackage.aaez
    public final defpackage.aaey c(java.lang.Class cls) {
        return this.b.j(cls);
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b.d();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.e(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b.f();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b.g();
    }
}
