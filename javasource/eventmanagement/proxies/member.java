// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package eventmanagement.proxies;

public class member
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject memberMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EventManagement.member";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		name("name"),
		description("description");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public member(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EventManagement.member"));
	}

	protected member(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject memberMendixObject)
	{
		if (memberMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EventManagement.member", memberMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EventManagement.member");

		this.memberMendixObject = memberMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'member.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static eventmanagement.proxies.member initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return eventmanagement.proxies.member.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static eventmanagement.proxies.member initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new eventmanagement.proxies.member(context, mendixObject);
	}

	public static eventmanagement.proxies.member load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return eventmanagement.proxies.member.initialize(context, mendixObject);
	}

	public static java.util.List<eventmanagement.proxies.member> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<eventmanagement.proxies.member> result = new java.util.ArrayList<eventmanagement.proxies.member>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//EventManagement.member" + xpathConstraint))
			result.add(eventmanagement.proxies.member.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of name
	 */
	public final java.lang.String getname()
	{
		return getname(getContext());
	}

	/**
	 * @param context
	 * @return value of name
	 */
	public final java.lang.String getname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.name.toString());
	}

	/**
	 * Set value of name
	 * @param name
	 */
	public final void setname(java.lang.String name)
	{
		setname(getContext(), name);
	}

	/**
	 * Set value of name
	 * @param context
	 * @param name
	 */
	public final void setname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.name.toString(), name);
	}

	/**
	 * @return value of description
	 */
	public final java.lang.String getdescription()
	{
		return getdescription(getContext());
	}

	/**
	 * @param context
	 * @return value of description
	 */
	public final java.lang.String getdescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.description.toString());
	}

	/**
	 * Set value of description
	 * @param description
	 */
	public final void setdescription(java.lang.String description)
	{
		setdescription(getContext(), description);
	}

	/**
	 * Set value of description
	 * @param context
	 * @param description
	 */
	public final void setdescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.description.toString(), description);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return memberMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final eventmanagement.proxies.member that = (eventmanagement.proxies.member) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "EventManagement.member";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}