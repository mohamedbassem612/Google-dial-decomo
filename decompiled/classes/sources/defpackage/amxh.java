package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxh implements defpackage.amww, defpackage.amyn {
    private final java.util.Set a = new java.util.HashSet();
    private boolean b = false;

    @Override // defpackage.amyn
    public final void a(defpackage.amym amymVar) {
        defpackage.ajsz.dF();
        if (this.b) {
            throw new java.lang.IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
        this.a.add(amymVar);
    }

    public final void b() {
        defpackage.ajsz.dF();
        this.b = true;
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.amym) it.next()).a();
        }
    }
}
