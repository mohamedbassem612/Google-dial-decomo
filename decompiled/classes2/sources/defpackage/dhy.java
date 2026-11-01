package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dhy {
    public final boolean a = false;
    public final boolean b = false;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dhy)) {
            return false;
        }
        defpackage.dhy dhyVar = (defpackage.dhy) obj;
        boolean z = dhyVar.a;
        boolean z2 = dhyVar.b;
        return true;
    }

    public final int hashCode() {
        return (anty.L(false) * 31) + anty.L(false);
    }

    public final java.lang.String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=false, suggestionSelected=false)";
    }
}
