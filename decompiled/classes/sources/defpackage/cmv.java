package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cmv implements defpackage.dao {
    public boolean A;
    public boolean B;
    private defpackage.aoss Bq;
    private boolean Br;
    private boolean Bs;
    public defpackage.aomy C;
    public boolean D;
    public int u;
    public defpackage.cmv w;
    public defpackage.cmv x;
    public defpackage.dcq y;
    public defpackage.dck z;
    public defpackage.cmv t = this;
    public int v = -1;

    @Override // defpackage.dao
    public final defpackage.cmv L() {
        return this.t;
    }

    public final defpackage.aoss M() {
        defpackage.aoss aossVar = this.Bq;
        if (aossVar != null) {
            return aossVar;
        }
        defpackage.aoss aossVarN = defpackage.aosv.n(((defpackage.deg) defpackage.cfo.C(this)).j.plus(new defpackage.aoud((defpackage.aoub) ((defpackage.deg) defpackage.cfo.C(this)).j.get(defpackage.aoub.d))));
        this.Bq = aossVarN;
        return aossVarN;
    }

    public void N() {
        if (this.D) {
            defpackage.cwh.d("node attached multiple times");
        }
        if (this.z == null) {
            defpackage.cwh.d("attach invoked on a node without a coordinator");
        }
        this.D = true;
        this.Br = true;
    }

    public void O() {
        if (!this.D) {
            defpackage.cwh.d("Cannot detach a node that is not attached");
        }
        if (this.Br) {
            defpackage.cwh.d("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.Bs) {
            defpackage.cwh.d("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.D = false;
        defpackage.aoss aossVar = this.Bq;
        if (aossVar != null) {
            defpackage.aosv.q(aossVar, new cmx());
            this.Bq = null;
        }
    }

    public void P() {
        if (!this.D) {
            defpackage.cwh.d("reset() called on an unattached node");
        }
        cZ();
    }

    public void Q() {
        if (!this.D) {
            defpackage.cwh.d("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.Br) {
            defpackage.cwh.d("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.Br = false;
        dc();
        this.Bs = true;
    }

    public void R() {
        if (!this.D) {
            defpackage.cwh.d("node detached multiple times");
        }
        if (this.z == null) {
            defpackage.cwh.d("detach invoked on a node without a coordinator");
        }
        if (!this.Bs) {
            defpackage.cwh.d("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.Bs = false;
        defpackage.aomy aomyVar = this.C;
        if (aomyVar != null) {
            aomyVar.a();
        }
        u();
    }

    public void S(defpackage.cmv cmvVar) {
        this.t = cmvVar;
    }

    public void T(defpackage.dck dckVar) {
        this.z = dckVar;
    }

    public boolean cO() {
        return true;
    }

    public /* synthetic */ void cL() {
    }

    public /* synthetic */ void cM() {
    }

    public void cZ() {
    }

    public void dc() {
    }

    public void u() {
    }
}
