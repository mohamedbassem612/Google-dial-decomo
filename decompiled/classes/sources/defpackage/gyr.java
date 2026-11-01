package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyr implements defpackage.grw {
    public final defpackage.gwj a;
    public final defpackage.gxm b;
    public final defpackage.gou c;

    static {
        defpackage.gsh.b("WMFgUpdater");
    }

    public gyr(androidx.work.impl.WorkDatabase workDatabase, defpackage.gwj gwjVar, defpackage.gou gouVar) {
        this.a = gwjVar;
        this.c = gouVar;
        this.b = workDatabase.D();
    }
}
