package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxg extends java.lang.Throwable {
    private final java.lang.String a;

    public bxg(boolean z, boolean z2, defpackage.aqj aqjVar, java.lang.Object obj) {
        this.a = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + aqjVar + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }
}
