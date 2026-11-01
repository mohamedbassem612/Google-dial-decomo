package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agoc {
    public final boolean a;
    public final aify b;
    public final aify c;

    public agoc(aify aifyVar) {
        this.a = false;
        this.b = aifyVar;
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agoc) {
            defpackage.agoc agocVar = (defpackage.agoc) obj;
            boolean z = agocVar.a;
            if (ahvr.aP(this.b, agocVar.b)) {
                aify aifyVar = agocVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ 385623362) * (-721379959);
    }

    public final java.lang.String toString() {
        return "Config{canSwitchAccounts=false, initialSelectors=" + java.lang.String.valueOf(this.b) + ", overrideRequirements=null, updateInitialSelectionContext=null}";
    }

    public agoc() {
        throw null;
    }
}
