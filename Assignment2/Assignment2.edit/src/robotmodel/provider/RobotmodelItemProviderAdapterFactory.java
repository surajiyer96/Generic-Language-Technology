/**
 */
package robotmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import robotmodel.util.RobotmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotmodelItemProviderAdapterFactory extends RobotmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.Script} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptItemProvider scriptItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptAdapter() {
		if (scriptItemProvider == null) {
			scriptItemProvider = new ScriptItemProvider(this);
		}

		return scriptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.IfStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatementItemProvider ifStatementItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStatementAdapter() {
		if (ifStatementItemProvider == null) {
			ifStatementItemProvider = new IfStatementItemProvider(this);
		}

		return ifStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.WhileStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStatementItemProvider whileStatementItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.WhileStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileStatementAdapter() {
		if (whileStatementItemProvider == null) {
			whileStatementItemProvider = new WhileStatementItemProvider(this);
		}

		return whileStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.RepeatStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatStatementItemProvider repeatStatementItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.RepeatStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatStatementAdapter() {
		if (repeatStatementItemProvider == null) {
			repeatStatementItemProvider = new RepeatStatementItemProvider(this);
		}

		return repeatStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.Comment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentItemProvider commentItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommentAdapter() {
		if (commentItemProvider == null) {
			commentItemProvider = new CommentItemProvider(this);
		}

		return commentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.TraceCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceCommandItemProvider traceCommandItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.TraceCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTraceCommandAdapter() {
		if (traceCommandItemProvider == null) {
			traceCommandItemProvider = new TraceCommandItemProvider(this);
		}

		return traceCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.AtomicCommand} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicCommandItemProvider atomicCommandItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.AtomicCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicCommandAdapter() {
		if (atomicCommandItemProvider == null) {
			atomicCommandItemProvider = new AtomicCommandItemProvider(this);
		}

		return atomicCommandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.NegatedExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegatedExpressionItemProvider negatedExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.NegatedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegatedExpressionAdapter() {
		if (negatedExpressionItemProvider == null) {
			negatedExpressionItemProvider = new NegatedExpressionItemProvider(this);
		}

		return negatedExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.BinaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionItemProvider binaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.BinaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryExpressionAdapter() {
		if (binaryExpressionItemProvider == null) {
			binaryExpressionItemProvider = new BinaryExpressionItemProvider(this);
		}

		return binaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.Layout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutItemProvider layoutItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayoutAdapter() {
		if (layoutItemProvider == null) {
			layoutItemProvider = new LayoutItemProvider(this);
		}

		return layoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.HeadingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadingExpressionItemProvider headingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.HeadingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadingExpressionAdapter() {
		if (headingExpressionItemProvider == null) {
			headingExpressionItemProvider = new HeadingExpressionItemProvider(this);
		}

		return headingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.WallAheadExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallAheadExpressionItemProvider wallAheadExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.WallAheadExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWallAheadExpressionAdapter() {
		if (wallAheadExpressionItemProvider == null) {
			wallAheadExpressionItemProvider = new WallAheadExpressionItemProvider(this);
		}

		return wallAheadExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.NormalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalExpressionItemProvider normalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.NormalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalExpressionAdapter() {
		if (normalExpressionItemProvider == null) {
			normalExpressionItemProvider = new NormalExpressionItemProvider(this);
		}

		return normalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link robotmodel.ConstructionStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructionStatementItemProvider constructionStatementItemProvider;

	/**
	 * This creates an adapter for a {@link robotmodel.ConstructionStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstructionStatementAdapter() {
		if (constructionStatementItemProvider == null) {
			constructionStatementItemProvider = new ConstructionStatementItemProvider(this);
		}

		return constructionStatementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (scriptItemProvider != null) scriptItemProvider.dispose();
		if (ifStatementItemProvider != null) ifStatementItemProvider.dispose();
		if (whileStatementItemProvider != null) whileStatementItemProvider.dispose();
		if (repeatStatementItemProvider != null) repeatStatementItemProvider.dispose();
		if (commentItemProvider != null) commentItemProvider.dispose();
		if (traceCommandItemProvider != null) traceCommandItemProvider.dispose();
		if (atomicCommandItemProvider != null) atomicCommandItemProvider.dispose();
		if (negatedExpressionItemProvider != null) negatedExpressionItemProvider.dispose();
		if (binaryExpressionItemProvider != null) binaryExpressionItemProvider.dispose();
		if (layoutItemProvider != null) layoutItemProvider.dispose();
		if (headingExpressionItemProvider != null) headingExpressionItemProvider.dispose();
		if (wallAheadExpressionItemProvider != null) wallAheadExpressionItemProvider.dispose();
		if (normalExpressionItemProvider != null) normalExpressionItemProvider.dispose();
		if (constructionStatementItemProvider != null) constructionStatementItemProvider.dispose();
	}

}
