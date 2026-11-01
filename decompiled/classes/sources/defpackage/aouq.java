package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aouq extends defpackage.apcb implements defpackage.aotx {
    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        java.lang.Object objF = f();
        defpackage.aooh.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z = true;
        for (defpackage.apcd apcdVarG = (defpackage.apcd) objF; !defpackage.aooh.n(apcdVarG, this); apcdVarG = apcdVarG.g()) {
            if ((apcdVarG instanceof defpackage.aoue) && !apcdVarG.fC()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(apcdVarG);
                z = false;
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.aotx
    public final boolean fA() {
        return true;
    }

    @Override // defpackage.apcd
    public final java.lang.String toString() {
        return defpackage.aosu.a ? c("Active") : super.toString();
    }

    @Override // defpackage.aotx
    public final defpackage.aouq fy() {
        return this;
    }
}
