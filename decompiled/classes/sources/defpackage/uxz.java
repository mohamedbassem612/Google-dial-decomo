package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class uxz extends defpackage.urd {
    public boolean o;

    @Override // defpackage.az, defpackage.mp, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.o = true;
    }

    @Override // defpackage.urd, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.o = true;
    }

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.o = false;
    }

    @Override // defpackage.mp, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.o = true;
    }

    @Override // defpackage.az, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.o = true;
    }

    @Override // defpackage.mp, defpackage.cm, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.o = false;
    }

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.o = true;
    }
}
