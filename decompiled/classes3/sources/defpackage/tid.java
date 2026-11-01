package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tid implements android.view.View.OnLongClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ ld b;

    public /* synthetic */ tid(ld ldVar, android.view.View view, int i) {
        this.$cid = i;
        this.b = ldVar;
        this.a = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.tie tieVar = (defpackage.tie) this.b;
            defpackage.wgg wggVar = tieVar.F;
            if (wggVar != null) {
                defpackage.wgh.a(this.a, wggVar, tieVar.G, tieVar.z);
                tieVar.F = null;
            } else {
                defpackage.tie.s.b().l("com/android/dialer/searchfragment/cp2/defaultdirectory/Cp2DefaultDirectoryContactViewHolder", "setListenersForPopupMenu", 274, "Cp2DefaultDirectoryContactViewHolder.java").v("popupMenuAnchorPoint is null.");
            }
        } else if (i != 1) {
            ld ldVar = this.b;
            if (i != 2) {
                defpackage.tio tioVar = (defpackage.tio) ldVar;
                defpackage.wgg wggVar2 = tioVar.J;
                if (wggVar2 == null) {
                    defpackage.tio.s.b().l("com/android/dialer/searchfragment/enhancedsearch/EnhancedCp2DefaultDirectoryContactViewHolder", "setListenersForPopupMenu", 328, "EnhancedCp2DefaultDirectoryContactViewHolder.java").v("popupMenuAnchorPoint is null.");
                    return true;
                }
                defpackage.wgh.a(this.a, wggVar2, tioVar.K, tioVar.E);
                tioVar.J = null;
                return true;
            }
            defpackage.tih tihVar = (defpackage.tih) ldVar;
            defpackage.wgg wggVar3 = tihVar.G;
            if (wggVar3 != null) {
                defpackage.wgh.a(this.a, wggVar3, tihVar.H, tihVar.z);
                tihVar.G = null;
            } else {
                defpackage.tih.s.b().l("com/android/dialer/searchfragment/cp2/extendeddirectories/Cp2ExtendedDirectoryContactViewHolder", "setListenersForPopupMenu", 307, "Cp2ExtendedDirectoryContactViewHolder.java").v("popupMenuAnchorPoint is null.");
            }
        } else {
            defpackage.thn thnVar = (defpackage.thn) this.b;
            defpackage.wgg wggVar4 = thnVar.F;
            if (wggVar4 != null) {
                defpackage.wgh.a(this.a, wggVar4, thnVar.G, thnVar.x);
                thnVar.F = null;
            } else {
                defpackage.thn.s.b().l("com/android/dialer/searchfragment/calllog/CallLogViewHolder", "setListenersForPopupMenu", 356, "CallLogViewHolder.java").v("popupMenuAnchorPoint is null.");
            }
        }
        return true;
    }
}
